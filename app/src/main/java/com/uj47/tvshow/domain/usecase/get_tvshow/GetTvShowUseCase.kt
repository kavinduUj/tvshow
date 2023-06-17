package com.uj47.tvshow.domain.usecase.get_tvshow

import com.uj47.tvshow.common.Resource
import com.uj47.tvshow.common.errorExtention
import com.uj47.tvshow.data.remote.dto.tvshow.toTvShow
import com.uj47.tvshow.domain.model.tvshow.TvShow
import com.uj47.tvshow.domain.repository.TvShowRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetTvShowUseCase @Inject constructor(
    private val tvShowRepository: TvShowRepository
) {

    operator fun invoke(): Flow<Resource<TvShow>> = flow {
        try {
            emit(Resource.Loading<TvShow>())
            val tvShow = tvShowRepository.getTvShow().toTvShow()
            emit(Resource.Success(tvShow))
        } catch (e: HttpException) {
            emit(Resource.Error<TvShow>(errorExtention(e.code())))
        } catch (e: IOException) {
            emit(Resource.Error<TvShow>("Check your internet connection!"))
        }
    }

}