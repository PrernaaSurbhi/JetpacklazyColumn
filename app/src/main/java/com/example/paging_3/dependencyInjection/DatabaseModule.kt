package com.example.paging_3.dependencyInjection

import android.content.Context
import androidx.room.Room
import com.example.paging_3.data.local.UnsplashDataBase
import com.example.paging_3.utils.Constants.UNSPLASH_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDataBase(
        @ApplicationContext context: Context
    ):UnsplashDataBase{
        return Room.databaseBuilder(
            context,
            UnsplashDataBase::class.java,
            UNSPLASH_DATABASE
        ).build()
    }

}