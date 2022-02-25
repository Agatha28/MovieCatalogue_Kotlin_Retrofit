package com.example.moviecatalogue.services

import com.example.moviecatalogue.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=7188024bfa458ef321e4b613ce338d0f")
    fun getMovieList(): Call<MovieResponse>
}