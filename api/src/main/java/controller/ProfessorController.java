package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import model.Professor;
import service.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
	
	@Autowired
	ProfessorService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Professor> create(@RequestBody Professor professor){
		Professor professorCreated = service.create(professor);
		return ResponseEntity.status(201).body(professorCreated);
	}
}
