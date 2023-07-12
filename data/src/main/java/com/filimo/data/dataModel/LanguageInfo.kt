package com.filimo.data.dataModel

import com.filimo.domain.dataModel.LanguageInfoModel
import com.google.gson.annotations.SerializedName

data class LanguageInfo(
    @SerializedName("flag" ) var flag : String? = null,
    @SerializedName("text" ) var text : String? = null
) : LanguageInfoModel
