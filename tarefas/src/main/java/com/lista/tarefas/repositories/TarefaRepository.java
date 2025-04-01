package com.lista.tarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lista.tarefas.entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

}