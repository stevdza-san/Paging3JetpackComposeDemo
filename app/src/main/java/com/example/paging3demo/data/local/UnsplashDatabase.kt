package com.example.paging3demo.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.paging3demo.data.local.dao.UnsplashImageDao
import com.example.paging3demo.data.local.dao.UnsplashRemoteKeysDao
import com.example.paging3demo.model.UnsplashImage
import com.example.paging3demo.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}