package com.example.appdegastos.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appdegastos.data.local.dao.TransactionDao
import com.example.appdegastos.data.local.entity.TransactionEntity

@Database(
    entities = [TransactionEntity::class],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun transactionDao(): TransactionDao

}