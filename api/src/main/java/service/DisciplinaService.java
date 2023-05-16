package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Disciplina;
import repository.DisciplinaRepository;

@Service
public class DisciplinaService {
	
	@Autowired
	DisciplinaRepository repository;
	public Disciplina create(Disciplina disciplina) {
		return repository.save(disciplina);
	}
	
	
	public List<Disciplina> findByProfessorId(Long professorId){
		return repository.findByProfessorId(professorId);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
