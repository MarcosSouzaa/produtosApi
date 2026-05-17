package com.inovasouzza.produtoapi.controller.Produto;

import com.inovasouzza.produtoapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping //quero criar/salvar dados ou recursos no meu servidor
    public void salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);

    }
}
