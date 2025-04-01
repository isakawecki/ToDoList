package com.lista.tarefas.entities;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tarefa")
public class Tarefa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long idUsuario;
	private String descricaoTarefa;
	private String nomeSetor;
	private Prioridade prioridade;
	private LocalDate date;
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	public Tarefa() {
	
	}
	
	public Tarefa(Long id, Long idUsuario, String descricaoTarefa, String nomeSetor, Prioridade prioridade,
			LocalDate date, Status status) {
	
		this.id = id;
		this.idUsuario= idUsuario;
		this.descricaoTarefa = descricaoTarefa;
		this.nomeSetor = nomeSetor;
		this.prioridade = prioridade;
		this.date = date;
		this.status = status;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}


	public void setDescricaoTarefa(String descricaoTarefa) {
		this.descricaoTarefa = descricaoTarefa;
	}


	public String getNomeSetor() {
		return nomeSetor;
	}


	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}


	public Prioridade getPrioridade() {
		return prioridade;
	}


	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}




	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
}
	