package com.ezatpanah.hilt_room_youtube.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ezatpanah.hilt_room_youtube.utils.Constants.NOTE_TABLE

@Entity(tableName = NOTE_TABLE)
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val noteId :Int =0,
    @ColumnInfo(name = "note_title")
    val noteTitle:String="",
    @ColumnInfo(name = "note_desc")
    val noteDesc : String=""
)
