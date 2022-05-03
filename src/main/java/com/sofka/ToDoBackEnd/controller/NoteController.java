package com.sofka.ToDoBackEnd.controller;

import com.sofka.ToDoBackEnd.Service.NoteService;
import com.sofka.ToDoBackEnd.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000/")
public class NoteController {

    @Autowired
    private NoteService service;

    @GetMapping("get/notes")
    public List<Note> getNotes(){
        return  service.getNotes();

    }

    @PostMapping("save/notes")
    public  Note saveNote(@RequestBody Note note){
        return service.saveNote(note);
    }

    @PutMapping("update/note")
    public Note updateNote(@RequestBody Note note){
        return service.saveNote(note);
    }

    @DeleteMapping("delete/note/{id}")
    public void deleteNote(@PathVariable Long id){
        service.deleteNote(id);
    }
}
