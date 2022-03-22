package com.app.lastfmcase.domain.use_case.saved_album

import com.app.lastfmcase.domain.model.local.SavedAlbumDetail
import com.app.lastfmcase.domain.repository.saved_album.SavedAlbumRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSavedAlbumDetailUseCase @Inject constructor(
    private val repository: SavedAlbumRepository
) {
    suspend fun execute(albumName: String): Flow<SavedAlbumDetail> {
        return repository.getSavedAlbumDetail(albumName)
    }
}