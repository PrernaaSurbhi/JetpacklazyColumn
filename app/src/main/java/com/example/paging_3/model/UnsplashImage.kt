package com.example.paging_3.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.paging_3.utils.Constants.UNSPLASH_IMAGE_TABLE
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = UNSPLASH_IMAGE_TABLE)
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id:String,
    val urls: Urls,
    val likes: Int,
    val user: User
)