package com.ezatpanah.hilt_room_youtube.repository

import com.ezatpanah.hilt_room_youtube.db.NoteDao
import com.ezatpanah.hilt_room_youtube.db.NoteEntity
import javax.inject.Inject

class DbRepository
@Inject constructor(
    private val dao: NoteDao,
) {

    fun saveNote(note: NoteEntity) = dao.inserNote(note)
    fun updateNote(note: NoteEntity) = dao.updateNote(note)
    fun deleteNote(note: NoteEntity) = dao.deleteNote(note)
    fun getNote(id : Int) : NoteEntity = dao.getNote(id)
    fun getAllNotes() = dao.getAllNotes()

}