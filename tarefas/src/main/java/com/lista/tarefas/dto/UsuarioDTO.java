package com.lista.tarefas.dto;

import com.lista.tarefas.entities.Usuario;

public class UsuarioDTO{
	private Long id;
	private String nome; 
	private String email;
	
	//Construtor vazio
	public UsuarioDTO () {
		
	
	}

	  // Construtor que converte uma entidade Tarefa para um DTO
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		nome = entity.getNome();
        email = entity.getEmail();

	
		
	}
	
	
    // Construtor com todos os campos
	public UsuarioDTO(Long id, String nome, String email, String telefone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		
	
	}

	  // Métodos getters e setters para acessar e modificar os campos
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
