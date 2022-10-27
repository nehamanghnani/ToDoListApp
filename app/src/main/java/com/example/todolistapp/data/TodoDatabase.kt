package com.example.todolistapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database
    (entities = [Todo::class],
    version = 1)

abstract class TodoDatabase : RoomDatabase() {
    abstract val todoDao : TodoDao
}