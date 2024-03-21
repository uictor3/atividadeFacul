package br.com.AtividadesFacul.api.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtividadesFeitas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    @JoinColumn(name = "fez_atividade")
    private PerfilPessoal perfil;

}
