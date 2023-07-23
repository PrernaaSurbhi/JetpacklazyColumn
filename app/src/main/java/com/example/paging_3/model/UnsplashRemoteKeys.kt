package com.example.paging_3.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.paging_3.utils.Constants.UNSPLASH_REMOTE_KEYS_TABLE
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = UNSPLASH_REMOTE_KEYS_TABLE)
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevPage: Int?,
    val nextPage: Int?
)
