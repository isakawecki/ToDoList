package com.lista.tarefas.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lista.tarefas.dto.TarefaDTO;
import com.lista.tarefas.entities.Prioridade;
import com.lista.tarefas.entities.Status;
import com.lista.tarefas.entities.Tarefa;
import com.lista.tarefas.entities.Usuario;
import com.lista.tarefas.repositories.TarefaRepository;
import com.lista.tarefas.repositories.UsuarioRepository;

import jakarta.transaction.Transactional;



@Service 
public class TarefaService {
	@Autowired
	TarefaRepository tarefaRepository;
	
	@Autowired 
	UsuarioRepository usuarioRepository;
	
	public List<TarefaDTO> findAll(){
		List<Tarefa> lista = tarefaRepository.findAll();
				return lista.stream().map( x -> new TarefaDTO(x)).toList();


	}
	
	public Page<TarefaDTO> findpagina(Pageable pagina){
		Page<Tarefa> busca = tarefaRepository.findAll(pagina);
		return busca.map( x -> new TarefaDTO(x));

}
	
	@Transactional
	public TarefaDTO inserir(TarefaDTO dto) {
		Tarefa tarefa = new Tarefa();
		tarefa.setDate(LocalDate.now());
		tarefa.setStatus(Status.A_FAZER);
		tarefa.setDescricaoTarefa(dto.getDescricaoTarefa());
		
		tarefa.setPrioridade(Prioridade.BAIXA);
	
		
		Usuario user = usuarioRepository.getReferenceById(dto.getIdUsuario());
		
		tarefa.setUsuario(user);
		tarefa = tarefaRepository.save(tarefa);
		return new TarefaDTO(tarefa);
	
	
		
	}


	}

	