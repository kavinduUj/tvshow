package com.uj47.tvshow.data.remote.dto.tvshow


import com.google.gson.annotations.SerializedName

data class Schedule(
    val days: List<String>,
    val time: String
)