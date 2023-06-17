package com.uj47.tvshow.data.remote.dto.tvshow


import com.google.gson.annotations.SerializedName

data class Externals(
    val imdb: String,
    val thetvdb: Int,
    val tvrage: Int
)