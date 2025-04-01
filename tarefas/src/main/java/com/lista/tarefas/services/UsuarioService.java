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
	
	public UsuarioDTO inserir(UsuarioDTO dto) {
		Usuario usuario = new Usuario();
	
		usuario.setNome(dto.getNome());
	    usuario.setEmail(dto.getEmail());
	
		
		usuario = usuarioRepository.save(usuario);
		return new UsuarioDTO(usuario);
	
	
		
	}


	}
