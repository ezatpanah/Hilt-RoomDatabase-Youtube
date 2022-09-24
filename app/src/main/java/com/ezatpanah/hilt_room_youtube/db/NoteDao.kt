package com.ezatpanah.hilt_room_youtube.db

import androidx.room.*
import com.ezatpanah.hilt_room_youtube.utils.Constants.NOTE_TABLE

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun inserNote(noteEntity: NoteEntity)

    @Update
    fun updateNote(noteEntity: NoteEntity)

    @Delete
    fun deleteNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM $NOTE_TABLE ORDER BY noteId DESC")
    fun getAllNotes() : MutableList<NoteEntity>

    @Query("SELECT * FROM $NOTE_TABLE WHERE noteId LIKE :id")
    fun getNote(id : Int) : NoteEntity

}