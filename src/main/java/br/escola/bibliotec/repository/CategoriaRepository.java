package br.escola.bibliotec.repository;

import br.escola.bibliotec.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findAllByOrderByNomeAsc();

    Optional<Categoria> findByNomeIgnoreCase(String nome);
}

