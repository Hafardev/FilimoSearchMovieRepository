package com.filimo.data.dataModel

import com.filimo.domain.dataModel.InfoModel
import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("background_color" ) var backgroundColor : String? = null,
    @SerializedName("text_color"       ) var textColor       : String? = null,
    @SerializedName("text"             ) var text            : String? = null,
    @SerializedName("icon"             ) var icon            : String? = null,
    @SerializedName("ui_type"          ) var uiType          : String? = null,
    @SerializedName("type"             ) var type            : String? = null
) : InfoModel
