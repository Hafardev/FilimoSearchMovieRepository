package com.filimo.data.dataModel

import com.filimo.domain.dataModel.AttributesModel
import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("id"                 ) var id              : String?               = null,
    @SerializedName("link_type"          ) var linkType        : String?               = null,
    @SerializedName("link_key"           ) var linkKey         : String?               = null,
    @SerializedName("theme"              ) var theme           : String?               = null,
    @SerializedName("output_type"        ) var outputType      : String?               = null,
    @SerializedName("movie_id"           ) var movieId         : String?               = null,
    @SerializedName("uid"                ) var uid             : String?               = null,
    @SerializedName("movie_title"        ) var movieTitle      : String?               = null,
    @SerializedName("movie_title_en"     ) var movieTitleEn    : String?               = null,
    @SerializedName("tag_id"             ) var tagId           : String?               = null,
    @SerializedName("serial"             ) var serial          : Serial?               = Serial(),
    @SerializedName("watermark"          ) var watermark       : Boolean?              = null,
    @SerializedName("HD"                 ) var HD              : Boolean?              = null,
    @SerializedName("watch_list_action"  ) var watchListAction : String?               = null,
    @SerializedName("commingsoon_txt"    ) var commingsoonTxt  : String?               = null,
    @SerializedName("rel_data"           ) var relData         : RelData?              = RelData(),
    @SerializedName("badge"              ) var badge           : Badge?                = Badge(),
    @SerializedName("rate_enable"        ) var rateEnable      : Boolean?              = null,
    @SerializedName("rate_enable_by_cnt" ) var rateEnableByCnt : Boolean?              = null,
    @SerializedName("rate_info"          ) var rateInfo        : String?               = null,
    @SerializedName("descr"              ) var descr           : String?               = null,
    @SerializedName("cover"              ) var cover           : String?               = null,
    @SerializedName("publish_date"       ) var publishDate     : String?               = null,
    @SerializedName("age_range"          ) var ageRange        : String?               = null,
    @SerializedName("pic"                ) var pic             : Pic?                  = Pic(),
    @SerializedName("rate_avrage"        ) var rateAvrage      : String?               = null,
    @SerializedName("avg_rate_label"     ) var avgRateLabel    : String?               = null,
    @SerializedName("pro_year"           ) var proYear         : String?               = null,
    @SerializedName("imdb_rate"          ) var imdbRate        : String?               = null,
    @SerializedName("categories"         ) var categories      : ArrayList<Categories> = arrayListOf(),
    @SerializedName("duration"           ) var duration        : Duration?             = Duration(),
    @SerializedName("countries"          ) var countries       : ArrayList<Countries>  = arrayListOf(),
    @SerializedName("dubbed"             ) var dubbed          : Dubbed?               = Dubbed(),
    @SerializedName("subtitle"           ) var subtitle        : Subtitle?             = Subtitle(),
    @SerializedName("audio"              ) var audio           : Audio?                = Audio(),
    @SerializedName("language_info"      ) var languageInfo    : LanguageInfo?         = LanguageInfo(),
    @SerializedName("director"           ) var director        : String?               = null,
    @SerializedName("last_watch"         ) var lastWatch       : ArrayList<String>     = arrayListOf(),
    @SerializedName("freemium"           ) var freemium        : Boolean?              = null,
    @SerializedName("position"           ) var position        : Int?                  = null,
    @SerializedName("sid"                ) var sid             : Int?                  = null,
    @SerializedName("uuid"               ) var uuid            : String?               = null
) : AttributesModel


