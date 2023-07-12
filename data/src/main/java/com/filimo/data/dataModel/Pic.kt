package com.filimo.data.dataModel

import com.filimo.domain.dataModel.PicModel
import com.google.gson.annotations.SerializedName

data class Pic(
    @SerializedName("movie_img_s" ) var movieImgS : String? = null,
    @SerializedName("movie_img_m" ) var movieImgM : String? = null,
    @SerializedName("movie_img_b" ) var movieImgB : String? = null
) : PicModel
