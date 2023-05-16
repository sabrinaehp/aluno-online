package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MatriculaAluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Double nota1;
	
	private Double nota2;
	
	@ManyToOne
	@JoinColumn (name = "aluno_id")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn (name = "disciplina_id")
	private Disciplina disciplina;
	
	private String status;
	
}
