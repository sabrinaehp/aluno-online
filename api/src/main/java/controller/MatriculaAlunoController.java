package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import model.MatriculaAluno;
import service.MatriculaAlunoService;

@RestController
@RequestMapping("/matricula-aluno")
public class MatriculaAlunoController {
	
	@Autowired
	MatriculaAlunoService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<MatriculaAluno> create(@RequestBody MatriculaAluno matriculaAluno){
		MatriculaAluno matriculaAlunoCreated = service.create(matriculaAluno);
		
		return ResponseEntity.status(201).body(matriculaAlunoCreated);
	}

}
