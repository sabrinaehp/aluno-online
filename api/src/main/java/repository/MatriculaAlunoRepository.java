package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.MatriculaAluno;

@Repository
public interface MatriculaAlunoRepository extends JpaRepository<MatriculaAluno, Long>{
	
}
