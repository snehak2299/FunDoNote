package com.example.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.note.entity.Note;

@Repository
public interface NoteRepo extends JpaRepository<Note,Long>{

	Note findByNoteId(long noteId);

}
