package com.uj47.tvshow.presentation.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uj47.tvshow.common.Resource
import com.uj47.tvshow.domain.model.tvshow.TvShow
import com.uj47.tvshow.domain.usecase.get_tvshow.GetTvShowUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TvShowListViewModel @Inject constructor(
    private val tvShowUseCase: GetTvShowUseCase
) : ViewModel() {

    private val _tvShow = MutableLiveData<Resource<TvShow>>()
    val tvShow: LiveData<Resource<TvShow>> = _tvShow

    init {
        getTvShows()
    }

    fun getTvShows() {
        viewModelScope.launch {
            tvShowUseCase()
                .catch { e ->
                    _tvShow.value = Resource.Error(e.message.toString())
                }
                .collect { result ->
                    _tvShow.value = result
                }
        }
    }
}