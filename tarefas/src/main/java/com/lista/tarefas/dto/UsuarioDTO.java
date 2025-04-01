package com.lista.tarefas.dto;

import com.lista.tarefas.entities.Usuario;

public class UsuarioDTO{
	private Long id;
	private String nome; 
	private String email;
	
	
	public UsuarioDTO () {
		
	
	}
	
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		nome = entity.getNome();
        email = entity.getEmail();

	
		
	}
	

	public UsuarioDTO(Long id, String nome, String email, String telefone) {
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