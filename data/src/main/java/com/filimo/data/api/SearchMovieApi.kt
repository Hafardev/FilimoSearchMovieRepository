package com.filimo.data.api

import com.filimo.data.dataModel.SearchMovieListResult
import retrofit2.http.GET
import retrofit2.http.Path

interface SearchMovieApi {
    @GET("/api/en/v1/movie/movie/list/tagid/1000300/text/{moviename}/sug/on")
    suspend fun getMovieSearchResult(@Path(value = "moviename",encoded = true) moviename: String): SearchMovieListResult

}