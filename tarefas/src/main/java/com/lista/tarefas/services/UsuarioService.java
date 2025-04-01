package com.lista.tarefas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lista.tarefas.dto.UsuarioDTO;
import com.lista.tarefas.entities.Usuario;
import com.lista.tarefas.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	
	@Autowired 
	UsuarioRepository usuarioRepository;

	    // Método para inserir um novo usuário 
	public UsuarioDTO inserir(UsuarioDTO dto) {
		Usuario usuario = new Usuario();
	
		usuario.setNome(dto.getNome());
	    usuario.setEmail(dto.getEmail());
	
		 // Salva o usuário no banco de dados e obtém o usuário salvo
		usuario = usuarioRepository.save(usuario);

		 // Retorna um DTO com as informações do usuário recém-criado
		return new UsuarioDTO(usuario);
	
	
		
	}


	}
