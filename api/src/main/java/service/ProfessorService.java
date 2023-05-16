package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Professor;
import repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	ProfessorRepository repository;
	
	public Professor create(Professor professor) { 
		return repository.save(professor); 
	}
	
	public List<Professor> findAll(){
		return repository.findAll();
	}
	
	public Optional<Professor> findById(Long id){
		return repository.findById(id);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
