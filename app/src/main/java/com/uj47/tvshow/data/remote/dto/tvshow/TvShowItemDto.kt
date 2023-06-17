package com.uj47.tvshow.data.remote.dto.tvshow

data class TvShowItemDto(
    val averageRuntime: Int,
    val ended: String?,
    val id: Int,
    val language: String?,
    val name: String?,
    val officialSite: String?,
    val premiered: String?,
    val runtime: Int,
    val status: String?,
    val summary: String?,
    val type: String?,
    val updated: Int,
    val url: String?,
    val weight: Int
)