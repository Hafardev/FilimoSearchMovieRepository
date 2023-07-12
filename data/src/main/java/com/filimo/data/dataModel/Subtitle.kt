package com.filimo.data.dataModel

import com.filimo.domain.dataModel.SubtitleModel
import com.google.gson.annotations.SerializedName

data class Subtitle(
    @SerializedName("enable" ) var enable : Boolean? = null,
    @SerializedName("text"   ) var text   : String?  = null
) : SubtitleModel
