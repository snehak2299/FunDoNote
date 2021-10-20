package com.example.note.vo;

import com.example.note.entity.Note;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class responsetemp {
	private User user;
	private Note note;
}
