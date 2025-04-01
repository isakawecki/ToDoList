package com.lista.tarefas.entities;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
// Campos representando os dados do usuário
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	
	 //Indica um relacionamento "um-para-muitos" com a classe Tarefa.
	@OneToMany(mappedBy = "usuario")
	private List<Tarefa> tarefas = new ArrayList<>();
	
	public Usuario() {
		
	}
	    // Métodos getters e setters para acessar e modificar os valores dos campos
	public Usuario(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	}
