package com.filimo.data.dataModel

import com.filimo.domain.dataModel.RelDataModel
import com.google.gson.annotations.SerializedName

data class RelData(
    @SerializedName("rel_type"     ) var relType    : String? = null,
    @SerializedName("rel_id"       ) var relId      : String? = null,
    @SerializedName("rel_uid"      ) var relUid     : String? = null,
    @SerializedName("rel_title"    ) var relTitle   : String? = null,
    @SerializedName("rel_type_txt" ) var relTypeTxt : String? = null
) : RelDataModel
