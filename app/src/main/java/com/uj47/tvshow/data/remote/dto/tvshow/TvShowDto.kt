package com.uj47.tvshow.data.remote.dto.tvshow
import com.uj47.tvshow.domain.model.tvshow.TvShow


class TvShowDto : ArrayList<TvShowItemDto>()

fun TvShowDto.toTvShow(): TvShow {
    val tvShowItems = this.map { tvShowItemDto ->
        TvShowItemDto(
            tvShowItemDto.averageRuntime,
            tvShowItemDto.ended ?: "",
            tvShowItemDto.id,
            tvShowItemDto.language,
            tvShowItemDto.name,
            tvShowItemDto.officialSite,
            tvShowItemDto.premiered,
            tvShowItemDto.runtime,
            tvShowItemDto.status,
            tvShowItemDto.summary,
            tvShowItemDto.type,
            tvShowItemDto.updated,
            tvShowItemDto.url,
            tvShowItemDto.weight
        )
    }
    return TvShow(ArrayList(tvShowItems))
}

