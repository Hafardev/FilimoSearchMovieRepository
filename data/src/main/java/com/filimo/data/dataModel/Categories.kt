package com.filimo.data.dataModel

import com.filimo.domain.dataModel.CategoriesModel
import com.google.gson.annotations.SerializedName

data class Categories(
    @SerializedName("title_en"  ) var titleEn  : String? = null,
    @SerializedName("title"     ) var title    : String? = null,
    @SerializedName("link_type" ) var linkType : String? = null,
    @SerializedName("link_key"  ) var linkKey  : String? = null
) : CategoriesModel
