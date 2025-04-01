package com.lista.tarefas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lista.tarefas.dto.UsuarioDTO;
import com.lista.tarefas.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioService service;
	
	@PostMapping(value = "/criar")
	public ResponseEntity<UsuarioDTO> insert(@RequestBody UsuarioDTO dto){
		dto = service.inserir(dto);
		return ResponseEntity.ok(dto);
	}
	



}
