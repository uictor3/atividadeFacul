package br.com.AtividadesFacul.api.repository;

import br.com.AtividadesFacul.api.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina,Long>{
}
