package com.example.paging_3.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.paging_3.model.UnsplashImage
import com.example.paging_3.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class],version = 1)
abstract class UnsplashDataBase :RoomDatabase() {

    abstract fun unsplashImageDao() :UnsplashImageDao
    abstract fun unsplashRemoteKeysDao() :UnsplashRemoteKeysDao
}