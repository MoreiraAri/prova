package com.example.prova.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    // Novos campos
    private int cargaHoraria;
    private String nivel;

    @ManyToMany(mappedBy = "cursos")
    private Set<Aluno> alunos;
}
