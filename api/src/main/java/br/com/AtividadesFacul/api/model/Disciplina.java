package br.com.AtividadesFacul.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disciplina implements Serializable {

    private Long Id;

    private String materia;

    @JoinColumn(name = "professor_id")
    private Professor professor;



}
