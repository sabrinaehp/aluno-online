package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{
	List<Disciplina> findByProfessorId(Long professorId);
}
