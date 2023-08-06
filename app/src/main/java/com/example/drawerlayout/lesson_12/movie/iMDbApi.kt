package com.example.drawerlayout.lesson_12.movie

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IMDbApi {

    @GET("/en/API/SearchMovie/k_zcuw1ytf/{expression}")
    fun findMovie(@Path("expression") expression: String) : Call<MoviesResponse>
}