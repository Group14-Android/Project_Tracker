package com.example.finalproject

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ProjectDao{
    @Query("SELECT * FROM project_tbl")
    fun getAll(): Flow<List<ProjectEntity>>

    @Insert
    fun insertAll(diaries: List<ProjectEntity>)

    @Insert
    fun insertOne(diary: ProjectEntity)

    @Query("SELECT num_remainingTasks/num_totalTasks FROM project_tbl")
    fun remainingTasks(): Int

    @Query("DELETE FROM project_tbl")
    fun deleteAll()
}
@Dao
interface NotesDao{
    @Query("SELECT * FROM notes_tbl")
    fun getAll(): Flow<List<NotesEntity>>

    @Insert
    fun insertAll(diaries: List<NotesEntity>)

    @Insert
    fun insertOne(diary: NotesEntity)

    @Query("SELECT * FROM notes_tbl WHERE project_id==:pid")
    fun relatedNotes(pid:Long): Int

    @Query("DELETE FROM notes_tbl")
    fun deleteAll()
}

@Dao
interface ResourcesDao{
    @Query("SELECT * FROM resources_tbl")
    fun getAll(): Flow<List<ResourcesEntity>>

    @Insert
    fun insertAll(diaries: List<ResourcesEntity>)

    @Insert
    fun insertOne(diary: ResourcesEntity)

    @Query("SELECT * FROM resources_tbl WHERE project_id==:pid")
    fun relatedResc(pid:Long): Int

    @Query("DELETE FROM resources_tbl")
    fun deleteAll()
}