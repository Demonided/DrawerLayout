package com.example.drawerlayout.lesson_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.drawerlayout.R
import com.example.drawerlayout.databinding.ActivityLesson12Binding
import com.example.drawerlayout.lesson_12.movie.IMDbApi
import com.example.drawerlayout.lesson_12.movie.Movie
import com.example.drawerlayout.lesson_12.movie.MoviesAdapter
import com.example.drawerlayout.lesson_12.movie.MoviesResponse
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Lesson12Activity : AppCompatActivity() {
    lateinit var binding: ActivityLesson12Binding

    private val imdbBaseUrl = "https://imdb-api.com"

    private val retrofit = Retrofit.Builder()
        .baseUrl(imdbBaseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val imdbService = retrofit.create(IMDbApi::class.java)

    private lateinit var searchButton: Button
    private lateinit var queryInput: EditText
    private lateinit var placeholderMessage: TextView
    private lateinit var moviesList: RecyclerView

    private val movies = ArrayList<Movie>()

    private val adapter = MoviesAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLesson12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        placeholderMessage = findViewById(R.id.placeholderMessage)
        searchButton = findViewById(R.id.searchButton)
        queryInput = findViewById(R.id.queryInput)
        moviesList = findViewById(R.id.locations)

        adapter.movies = movies

        moviesList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        moviesList.adapter = adapter

        searchButton.setOnClickListener {
            if (queryInput.text.isNotEmpty()) {
                imdbService.findMovie(queryInput.text.toString())
                    .enqueue(object : Callback<MoviesResponse> {
                        override fun onResponse(
                            call: Call<MoviesResponse>,
                            response: Response<MoviesResponse>
                        ) {
                            if (response.code() == 200) {
                                movies.clear()
                                if (response.body()?.results?.isNotEmpty() == true) {
                                    movies.addAll(response.body()?.results!!)
                                    adapter.notifyDataSetChanged()
                                    Toast.makeText(applicationContext, response.body()?.results.toString(), Toast.LENGTH_LONG).show()
                                }
                                if (movies.isEmpty()) {
                                    showMessage(getString(R.string.nothing_found), "")
                                    Toast.makeText(applicationContext, "PuStO", Toast.LENGTH_LONG).show()
                                } else {
                                    showMessage("", "")
                                }
                            } else {
                                showMessage(getString(R.string.something_went_wrong), response.code().toString())
                            }
                        }

                        override fun onFailure(call: Call<MoviesResponse>, t: Throwable) {
                            showMessage(getString(R.string.something_went_wrong), t.message.toString())
                        }

                    })
            }
        }

    }


    private fun showMessage(text: String, additionalMessage: String) {
        if (text.isNotEmpty()) {
            placeholderMessage.visibility = View.VISIBLE
            movies.clear()
            adapter.notifyDataSetChanged()
            placeholderMessage.text = text
            if (additionalMessage.isNotEmpty()) {
                Toast.makeText(applicationContext, additionalMessage, Toast.LENGTH_LONG).show()
            }
        } else {
            placeholderMessage.visibility = View.GONE
        }
    }
}