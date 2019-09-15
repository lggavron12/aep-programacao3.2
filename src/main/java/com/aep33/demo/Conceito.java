package com.aep33.demo;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Conceito {
	@OneToMany
	@Id
	private String id;
	private float nota;
	private Avaliacao avaliacao;
	private Aluno aluno;

	public Conceito() {
		this.id = UUID.randomUUID().toString();
		this.avaliacao = new Avaliacao("Disciplina", "Professor");
		this.aluno = new Aluno("Aluno1");
	}

	public Conceito(float nota) throws Exception {
		try {
			this.nota = nota;
		} catch (Exception e) {
			if (nota > 10.0 || nota < 0) {
				throw new Exception("A nota deve ser entre 0.0 e 10.0!");
			}

		}

	}

	public String getId() {
		return id;
	}

	public float getNota() {
		return nota;
	}

}
