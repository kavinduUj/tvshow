package com.uj47.tvshow.di

import com.uj47.tvshow.common.Constants
import com.uj47.tvshow.data.remote.api.ApiService
import com.uj47.tvshow.data.repository.TvShowRepositoryImpl
import com.uj47.tvshow.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideRepos(apiService: ApiService): TvShowRepository{
        return TvShowRepositoryImpl(apiService)
    }
}