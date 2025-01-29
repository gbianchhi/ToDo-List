package com.project.ToDo_List.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime criadoEm;
    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        PENDENTE,
        EM_ANDAMENTO,
        CONCLUIDO
    }

}
