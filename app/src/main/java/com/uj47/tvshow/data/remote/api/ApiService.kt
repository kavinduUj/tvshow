package com.uj47.tvshow.data.remote.api

import com.uj47.tvshow.data.remote.dto.tvshow.TvShowDto
import retrofit2.http.GET

interface ApiService {

    @GET("showsx")
    suspend fun getShows (): TvShowDto

}