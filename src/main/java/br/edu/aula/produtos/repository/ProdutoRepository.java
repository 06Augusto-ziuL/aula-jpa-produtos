package br.edu.aula.produtos.repository;

import br.edu.aula.produtos.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository
        extends JpaRepository<Produto, Long> {
}