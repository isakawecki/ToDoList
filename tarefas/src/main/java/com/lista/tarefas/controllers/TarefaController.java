package com.lista.tarefas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lista.tarefas.dto.TarefaDTO;
import com.lista.tarefas.services.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

	 //Injeta o serviço TarefaService
	@Autowired
	TarefaService service;
	
	// Retorna todas as tarefas
	@GetMapping
	public List<TarefaDTO> findAll(){
		return service.findAll();
		
	}
	//Cria uma nova tarefa
	@PostMapping("/criar")
	public ResponseEntity<TarefaDTO> insert(@RequestBody TarefaDTO dto){
		dto = service.inserir(dto);
		return ResponseEntity.ok(dto);
	}


}
