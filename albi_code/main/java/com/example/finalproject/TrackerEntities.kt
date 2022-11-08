package com.example.finalproject

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "project_tbl")
data class ProjectEntity(

    @ColumnInfo(name="title") val title:String?,
    @ColumnInfo(name="summary") val summary:String?,
    @ColumnInfo(name="description") val description:String?,
    @ColumnInfo(name="Tasks") val tasks:String?,
    @ColumnInfo(name="num_remainingTasks") val num_remainingTasks: Int?,
    @ColumnInfo(name="num_totalTasks") val num_totalTasks :Int?,
    @ColumnInfo(name="startDate") val startDate:String?, //= Date(),
    @PrimaryKey(autoGenerate = true) val id:Long=0
)

@Entity(tableName = "notes_tbl", foreignKeys = [ForeignKey(
    entity = ProjectEntity::class,
    parentColumns = ["id"],
    childColumns = ["project_id"],
    onDelete = CASCADE
)]
)
data class NotesEntity(

    @ColumnInfo(name="title") val title:String?,
    @ColumnInfo(name="summary") val summary:String?,
    @ColumnInfo(name="description") val description:String?,
    @ColumnInfo(name="startDate") val startDate:String?, //= Date(),
    @ColumnInfo(name="project_id") val project_id: Long?,
    @PrimaryKey(autoGenerate = true) val id:Long=0
)

@Entity(tableName = "resources_tbl",foreignKeys = [ForeignKey(
    entity = ProjectEntity::class,
    parentColumns = ["id"],
    childColumns = ["project_id"],
    onDelete = CASCADE
)])
data class ResourcesEntity(

    @ColumnInfo(name="title") val title:String?,
    @ColumnInfo(name="summary") val summary:String?,
    @ColumnInfo(name="link") val description:String?,
    @ColumnInfo(name="project_id") val project_id: Long?,
    @PrimaryKey(autoGenerate = true) val id:Long=0
)