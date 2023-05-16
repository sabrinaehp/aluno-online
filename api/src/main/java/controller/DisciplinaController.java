package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import model.Disciplina;
import service.DisciplinaService;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

	
	@Autowired
	DisciplinaService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Disciplina> create(@RequestBody Disciplina disciplina){
		Disciplina disciplinaCreated = service.create(disciplina);
		return ResponseEntity.status(201).body(disciplinaCreated);
	}
	
	@GetMapping("/professor/{professorId}")
	@ResponseStatus(HttpStatus.OK)
	public List<Disciplina> findByProfessorId(@PathVariable Long professorId){
		return service.findByProfessorId(professorId);
	}
}
