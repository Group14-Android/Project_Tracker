package com.example.finalproject

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ProjectEntity::class,NotesEntity::class,ResourcesEntity::class], version=2)

abstract class AppDatabase: RoomDatabase(){

    abstract fun projDao() :ProjectDao
    abstract fun noteDao():NotesDao
    abstract fun rescDao():ResourcesDao

    companion object{
        @Volatile
        private var INSTANCE:AppDatabase?=null
        fun getInstance(context: Context):AppDatabase=
            INSTANCE?: synchronized(this){
                INSTANCE ?: buildDatabase(context).also {INSTANCE=it}
            }

        private fun buildDatabase(context: Context)=
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java, "Project-db"
            ).fallbackToDestructiveMigration().build()

    }
}