package com.lista.tarefas.dto;
import java.time.LocalDate;

import com.lista.tarefas.entities.Prioridade;
import com.lista.tarefas.entities.Status;
import com.lista.tarefas.entities.Tarefa;

public class TarefaDTO {
    private Long id;
    private Long idUsuario;
    private String descricaoTarefa;
    private String nomeSetor;
    private Prioridade prioridade;
    private LocalDate date;
    private Status status;

    public TarefaDTO() {}

    public TarefaDTO(Tarefa entity) {
        id = entity.getId();
        idUsuario = entity.getUsuario().getId();
        descricaoTarefa = entity.getDescricaoTarefa();
        nomeSetor = entity.getNomeSetor();
        prioridade = entity.getPrioridade();
        date = entity.getDate();
        status = entity.getStatus();
    }

    public TarefaDTO(Long id, Long idUsuario, String descricaoTarefa, String nomeSetor, Prioridade prioridade,
                     LocalDate date, Status status) {
        this.id = id;
        this.idUsuario = idUsuario;
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
}
