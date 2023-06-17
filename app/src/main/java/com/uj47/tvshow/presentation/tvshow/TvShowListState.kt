package com.uj47.tvshow.presentation.tvshow

import com.uj47.tvshow.domain.model.tvshow.TvShow

data class TvShowListState(
    val isLoading: Boolean = false,
    val tvShow: TvShow? = null,
    val error: String = ""
){
    override fun toString(): String {
        return "TvShowListState(tvShow=$tvShow, isLoading=$isLoading, error='$error')"
    }
}
