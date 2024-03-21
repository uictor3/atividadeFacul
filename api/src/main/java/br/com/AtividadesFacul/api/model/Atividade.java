package br.com.AtividadesFacul.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Atividade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private  String Exercicio;

    private  String Prazo;

    private String Prazo_atual;

    private  String Entrega;

    @JoinColumn (name = "disciplina_id")
    private  Disciplina disciplina;
}
