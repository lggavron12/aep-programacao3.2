package com.aep33.demo;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Aluno {
	@Id
	private String id;
	private String nome;

	public Aluno(@NotNull String nome) {
		this.nome = nome;
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}
}
