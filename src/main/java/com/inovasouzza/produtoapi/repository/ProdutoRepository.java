package com.inovasouzza.produtoapi.repository;

import com.inovasouzza.produtoapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
