package com.inovasouzza.produtoapi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/*ESSA É A CLASSE DE NEGÓCIOS*/
//POJO - Plain Old Java Object
@Getter
@Setter
@ToString /*Criado esse toString para representar meu produto no controller*/
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
}

