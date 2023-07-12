package com.filimo.data.dataModel

import com.filimo.domain.dataModel.AudioModel
import com.google.gson.annotations.SerializedName

data class Audio(
    @SerializedName("languages") var languages: ArrayList<String> = arrayListOf(),
    @SerializedName("isMultiLanguage") var isMultiLanguage: Boolean? = null
) : AudioModel
