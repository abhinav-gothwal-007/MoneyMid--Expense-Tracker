package dev.abhinav.expensetracker.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.abhinav.expensetracker.model.Transaction

@Database(
    entities = [Transaction::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getTransactionDao(): TransactionDao
}
