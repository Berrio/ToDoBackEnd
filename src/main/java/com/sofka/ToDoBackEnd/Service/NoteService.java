package com.sofka.ToDoBackEnd.Service;
import com.sofka.ToDoBackEnd.entity.Note;

import java.util.List;

public interface NoteService {

    List<Note> getNotes();
    Note saveNote(Note note);
    Note UpdateNote(Note note);
    void deleteNote(Long id);


}
