package br.com.AtividadesFacul.api.repository;

import br.com.AtividadesFacul.api.model.PerfilPessoal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilPessoalRepository extends JpaRepository<PerfilPessoal,Long> {
}
