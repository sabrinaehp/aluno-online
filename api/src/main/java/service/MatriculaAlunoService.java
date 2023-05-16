package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.MatriculaAluno;
import repository.MatriculaAlunoRepository;

@Service
public class MatriculaAlunoService {
	
	@Autowired
	MatriculaAlunoRepository repository;
	
	public MatriculaAluno create(MatriculaAluno matriculaAluno) {
		return repository.save(matriculaAluno);
	}
	
	public List<MatriculaAluno> findAll(){
		return repository.findAll();
	}
	
	public Optional<MatriculaAluno> findById(Long id){
		return repository.findById(id);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}