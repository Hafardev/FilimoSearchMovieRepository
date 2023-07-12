package com.filimo.data.dataModel

import com.filimo.domain.dataModel.SerialModel
import com.google.gson.annotations.SerializedName

data class Serial(
    @SerializedName("enable"       ) var enable      : Boolean? = null,
    @SerializedName("parent_title" ) var parentTitle : String?  = null,
    @SerializedName("season_id"    ) var seasonId    : Int?     = null,
    @SerializedName("serial_part"  ) var serialPart  : String?  = null,
    @SerializedName("part_text"    ) var partText    : String?  = null,
    @SerializedName("season_text"  ) var seasonText  : String?  = null,
    @SerializedName("last_part"    ) var lastPart    : String?  = null
) : SerialModel
