package com.inovasouzza.produtoapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/*ESSA É A CLASSE DE NEGÓCIOS*/
//POJO - Plain Old Java Object
@Getter
@Setter
@ToString /*Criado esse toString para representar meu produto no controller*/
@Entity
@Table(name = "produto") /*Se o nome da tabela for o mesmo no DB, não precisa colocar o nome*/
public class Produto {
    /*Se o nome for o mesmo das colunas no Banco, não precisa colocar o @Column*/
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "preco")
    private BigDecimal preco;
}

