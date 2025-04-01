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
	
	 // Repositório para interagir com as tarefas no banco de dados
	@Autowired
	TarefaRepository tarefaRepository;

	// Repositório para interagir com os usuários
	@Autowired 
	UsuarioRepository usuarioRepository;

	 // Método para buscar todas as tarefas
	public List<TarefaDTO> findAll(){
		List<Tarefa> lista = tarefaRepository.findAll();  // Busca todas as tarefas no banco
				return lista.stream().map( x -> new TarefaDTO(x)).toList(); // Converte as tarefas em DTOs e retorna


	}

	
    // Método para buscar tarefas com paginação
	
	public Page<TarefaDTO> findpagina(Pageable pagina){
		Page<Tarefa> busca = tarefaRepository.findAll(pagina);
		return busca.map( x -> new TarefaDTO(x));

}
	  // Método para inserir uma nova tarefa
	@Transactional
	public TarefaDTO inserir(TarefaDTO dto) {
		Tarefa tarefa = new Tarefa();
		tarefa.setDate(LocalDate.now()); // Define a data atual como a data da tarefa
		tarefa.setStatus(Status.A_FAZER); // Define o status inicial como "A_FAZER"
		tarefa.setDescricaoTarefa(dto.getDescricaoTarefa());
		
		tarefa.setPrioridade(Prioridade.BAIXA);  // Define a prioridade inicial como BAIXA
	
		 // Busca o usuário associado à tarefa pelo ID
		Usuario user = usuarioRepository.getReferenceById(dto.getIdUsuario());
		
		tarefa.setUsuario(user);
		tarefa = tarefaRepository.save(tarefa);
		return new TarefaDTO(tarefa);
	
	
		
	}


	}

	
