package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import model.Aluno;
import service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	AlunoService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Aluno> create(@RequestBody Aluno aluno){
		Aluno alunoCreated = service.create(aluno);
		return ResponseEntity.status(201).body(alunoCreated);
	}
	
	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	public List<Aluno> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Aluno> findById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		
	}
	
}
