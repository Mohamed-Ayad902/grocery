package com.example.grocery.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.grocery.models.Product

@Database(entities = [Product::class], version = 1)
abstract class FavoriteDatabase :RoomDatabase(){

    abstract fun dao():FavoriteDao
}