package com.example.note.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long noteId;
	private long userid;
	private String title;
	private String description;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
	private boolean pinned;
	private boolean trashed;
	private boolean archieved;
	
}
