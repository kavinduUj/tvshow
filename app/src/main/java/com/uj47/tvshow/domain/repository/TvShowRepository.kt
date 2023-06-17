package com.uj47.tvshow.domain.repository
import com.uj47.tvshow.data.remote.dto.tvshow.TvShowDto

interface TvShowRepository {

    suspend fun getTvShow(): TvShowDto
}