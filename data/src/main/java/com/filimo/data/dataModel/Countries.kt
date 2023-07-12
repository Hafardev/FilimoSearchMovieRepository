package com.filimo.data.dataModel

import com.filimo.domain.dataModel.CountriesModel
import com.google.gson.annotations.SerializedName

data class Countries(
    @SerializedName("country"    ) var country   : String? = null,
    @SerializedName("country_en" ) var countryEn : String? = null
) : CountriesModel
