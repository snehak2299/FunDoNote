package com.example.note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.note.entity.Note;
import com.example.note.repository.NoteRepo;
import com.example.note.vo.User;
import com.example.note.vo.responsetemp;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NoteService {
	@Autowired
	private NoteRepo noterepo;
	
	@Autowired
	private RestTemplate restTemplate;

	public Note saveNote(Note note) {
		// TODO Auto-generated method stub
		log.info("inside save note service");
		return noterepo.save(note);
	}

	public responsetemp getNoteWithUser(long noteId) {
		// TODO Auto-generated method stub
		responsetemp vo= new responsetemp();
		Note note = noterepo.findByNoteId(noteId);
		//User user = restTemplate.getForObject(null, null)
		User user = restTemplate.getForObject("http://localhost:8081/user/"+note.getUserid(), User.class);
		vo.setNote(note);
		vo.setUser(user);
		return vo;
	}
	
	
}
