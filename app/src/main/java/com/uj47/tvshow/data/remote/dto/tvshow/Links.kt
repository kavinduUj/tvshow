package com.uj47.tvshow.data.remote.dto.tvshow


import com.google.gson.annotations.SerializedName

data class Links(
    val nextepisode: Nextepisode,
    val previousepisode: Previousepisode,
    val self: Self
)