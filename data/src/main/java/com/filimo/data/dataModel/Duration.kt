package com.filimo.data.dataModel

import com.filimo.domain.dataModel.DurationModel
import com.google.gson.annotations.SerializedName

data class Duration(
    @SerializedName("value" ) var value : Int?    = null,
    @SerializedName("text"  ) var text  : String? = null
) : DurationModel
