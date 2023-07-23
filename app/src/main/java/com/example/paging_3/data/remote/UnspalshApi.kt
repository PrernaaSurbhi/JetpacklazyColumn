package com.example.paging_3.data.remote


import com.example.jetpackcomposerecyclerview.BuildConfig
import com.example.paging_3.model.SearchResult
import com.example.paging_3.model.UnsplashImage

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnspalshApi {
    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/photos")
    fun getAllImages(@Query("page")page:Int,@Query("per_page")per_page:Int):List<UnsplashImage>

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("query") query: String,
        @Query("per_page") perPage: Int
    ): SearchResult
}