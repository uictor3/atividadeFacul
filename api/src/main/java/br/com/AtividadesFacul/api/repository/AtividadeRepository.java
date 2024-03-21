package br.com.AtividadesFacul.api.repository;

import br.com.AtividadesFacul.api.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AtividadeRepository extends JpaRepository<Atividade,Long> {
}
