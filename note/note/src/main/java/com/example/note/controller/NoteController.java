package com.example.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.note.entity.Note;
import com.example.note.service.NoteService;
import com.example.note.vo.responsetemp;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/note")
@Slf4j
public class NoteController {
	 @Autowired
	private NoteService noteservice;
	 
	 @PostMapping("/")
	 public Note saveNote(@RequestBody Note note) {
		 log.info("inside note controller");
		return noteservice.saveNote(note); 
	 }
	 
	 @GetMapping("/{id}")
	 public responsetemp getNoteWithUser(@PathVariable("id") long noteId) {
		 log.info("inside get note with user controller");
		 return noteservice.getNoteWithUser(noteId);
	 }
}
