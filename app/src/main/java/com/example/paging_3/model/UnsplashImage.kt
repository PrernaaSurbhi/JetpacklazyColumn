package com.example.paging_3.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = "unSplash_image_table")
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id:String,
    val urls: Urls,
    val likes: Int,
    val user: User
)