package com.dicoding.newsapp.data.remote.retrofit

import com.dicoding.newsapp.data.remote.response.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines?country=us&category=technology")
    fun getNews(@Query("apiKey") apiKey: String): NewsResponse
}