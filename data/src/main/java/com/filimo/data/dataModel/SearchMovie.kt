package com.filimo.data.dataModel

import com.filimo.domain.dataModel.SearchMovieModel
import com.google.gson.annotations.SerializedName

data class SearchMovie(
    @SerializedName("type"       ) var type       : String?     = null,
    @SerializedName("id"         ) var id         : Int?        = null,
    @SerializedName("attributes" ) var attributes : Attributes? = Attributes()
) : SearchMovieModel