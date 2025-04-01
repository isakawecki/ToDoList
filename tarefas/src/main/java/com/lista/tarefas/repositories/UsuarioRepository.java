package com.lista.tarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lista.tarefas.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
