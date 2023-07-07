package com.example.mymovies.repository

import com.example.mymovies.model.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "f321a808e68611f41312aa8408531476",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}


