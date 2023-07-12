package com.filimo.data.dataModel

import com.filimo.domain.dataModel.BadgeModel
import com.google.gson.annotations.SerializedName

data class Badge(
    @SerializedName("free"           ) var free          : Boolean?          = null,
    @SerializedName("backstage"      ) var backstage     : Boolean?          = null,
    @SerializedName("vision"         ) var vision        : Boolean?          = null,
    @SerializedName("hear"           ) var hear          : Boolean?          = null,
    @SerializedName("online_release" ) var onlineRelease : Boolean?          = null,
    @SerializedName("exclusive"      ) var exclusive     : Boolean?          = null,
    @SerializedName("commingsoon"    ) var commingsoon   : Boolean?          = null,
    @SerializedName("info"           ) var info          : ArrayList<Info> = arrayListOf()
) : BadgeModel
