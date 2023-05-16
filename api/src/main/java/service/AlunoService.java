package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import model.Aluno;
import repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepository repository;
	
	public Aluno create(Aluno aluno) {
		return repository.save(aluno);
	}
	
	public List<Aluno> findAll(){
		return repository.findAll();
	}
	
	public Optional<Aluno> findById(Long id){
		return repository.findById(id);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
