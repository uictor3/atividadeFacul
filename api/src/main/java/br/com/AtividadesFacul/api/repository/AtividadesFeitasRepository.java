package br.com.AtividadesFacul.api.repository;

import br.com.AtividadesFacul.api.model.AtividadesFeitas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AtividadesFeitasRepository extends JpaRepository<AtividadesFeitas, Long> {
}
