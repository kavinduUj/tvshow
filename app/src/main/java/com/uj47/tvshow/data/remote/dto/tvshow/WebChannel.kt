package com.uj47.tvshow.data.remote.dto.tvshow


import com.google.gson.annotations.SerializedName

data class WebChannel(
    val country: Country,
    val id: Int,
    val name: String,
    val officialSite: String
)