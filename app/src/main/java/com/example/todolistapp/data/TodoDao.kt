package com.example.todolistapp.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    @Query("select * from Todo")
    fun getTodos () : Flow<List<Todo>>

    @Query("select * from Todo where id = :id ")
    fun getTodosById (id : Int ) : Flow<List<Todo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo (todo : Todo)

    @Delete
    suspend fun deleteTodo (todo: Todo)
}