package com.aep33.demo;

import java.util.UUID;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Avaliacao {
	private String id;
	private String disciplina;
	private String professor;

	public Avaliacao(@NotNull String disciplia, @NotNull String professor) {
		this.id = UUID.randomUUID().toString();
		this.disciplina = disciplia;
		this.professor = professor;
	}

	public String getId() {
		return id;
	}

	public String getDisciplina() {
		return disciplina;
	}
}
