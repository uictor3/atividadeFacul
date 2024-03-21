package br.com.AtividadesFacul.api.repository;

import br.com.AtividadesFacul.api.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor , Long> {


}
