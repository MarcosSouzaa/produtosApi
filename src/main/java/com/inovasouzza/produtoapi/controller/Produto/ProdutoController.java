package com.inovasouzza.produtoapi.controller.Produto;

import com.inovasouzza.produtoapi.model.Produto;
import com.inovasouzza.produtoapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    //Definindo minha propriedade para injetar a interface
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {

        this.produtoRepository = produtoRepository;
    }
    @PostMapping //quero criar/salvar dados ou recursos no meu servidor
    public  Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("{id}")
    public Produto obterPorId(@PathVariable("id") String id){
        return produtoRepository.findById(id).orElse(null);
    }
}

