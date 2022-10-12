package com.example.grocery.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.grocery.models.Cart
import com.example.grocery.models.Laptop
import com.example.grocery.models.Product

@Database(entities = [Laptop::class, Product::class, Cart::class], version = 1)
abstract class Database : RoomDatabase() {

    abstract fun favoriteDao(): FavoriteDao
    abstract fun cartDao(): CartDao
}