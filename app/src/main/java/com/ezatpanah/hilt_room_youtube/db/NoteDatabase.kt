package com.ezatpanah.hilt_room_youtube.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDatabase : RoomDatabase(){
    abstract  fun noteDoa():NoteDao
}