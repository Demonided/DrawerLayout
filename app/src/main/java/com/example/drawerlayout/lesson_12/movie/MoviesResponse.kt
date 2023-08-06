package com.example.drawerlayout.lesson_12.movie

class MoviesResponse(
    val searchType: String,
    val expression: String,
    val results: List<Movie>
)