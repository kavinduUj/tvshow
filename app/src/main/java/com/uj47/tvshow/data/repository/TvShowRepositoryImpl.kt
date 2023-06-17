package com.uj47.tvshow.data.repository

import com.uj47.tvshow.data.remote.api.ApiService
import com.uj47.tvshow.data.remote.dto.tvshow.TvShowDto
import com.uj47.tvshow.data.remote.dto.tvshow.TvShowItemDto
import com.uj47.tvshow.domain.repository.TvShowRepository
import javax.inject.Inject

class TvShowRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : TvShowRepository {
    override suspend fun getTvShow(): TvShowDto {
        return apiService.getShows()
    }
}