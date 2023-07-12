package com.filimo.data.dataModel

import com.filimo.domain.dataModel.SearchMovieListResultModel
import com.google.gson.annotations.SerializedName

data class SearchMovieListResult(
    @SerializedName("data") var data: ArrayList<SearchMovie> = arrayListOf(),
) : SearchMovieListResultModel
