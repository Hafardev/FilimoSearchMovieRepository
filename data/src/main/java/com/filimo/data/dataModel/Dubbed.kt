package com.filimo.data.dataModel

import com.filimo.domain.dataModel.DubbedModel
import com.google.gson.annotations.SerializedName

data class Dubbed(
    @SerializedName("enable" ) var enable : Boolean? = null,
    @SerializedName("text"   ) var text   : String?  = null
) : DubbedModel
