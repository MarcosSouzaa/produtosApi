# 📦 ProdutoAPI - CRUD de Produtos com Spring Boot

Este repositório contém o desenvolvimento da primeira etapa da minha jornada de transição de carreira para o desenvolvimento de software. Trata-se de uma aplicação RESTful simples e focada, construída para fixar os conceitos fundamentais do ecossistema **Spring Boot**, persistência de dados com **Spring Data JPA** e manipulação estruturada em banco de dados.

O objetivo principal desta fase foi dominar o fluxo completo de um CRUD (Create, Read, Update, Delete) utilizando uma arquitetura em camadas bem definida.

---

## 🛠️ Recursos & Funcionalidades Desenvolvidas

A **ProdutoAPI** foi construída para gerenciar o ciclo de vida de produtos com as seguintes capacidades e endpoints:

* **Criar e Salvar Produtos (`POST`):** Endpoint responsável por receber os dados de um novo produto e persistir as informações com segurança no banco de dados.
* **Pesquisar por ID (`GET` / `:id`):** Consulta cirúrgica ao banco de dados para retornar os detalhes de um produto específico com base no seu código identificador.
* **Consultar por Nome (`GET`):** Implementação de busca customizada utilizando métodos de consulta (*Query Methods*) do Spring Data para localizar registros pelo nome do produto.
* **Atualizar ou Editar (`PUT`):** Fluxo para alteração e sincronização imediata de dados cadastrais de produtos existentes.
* **Deletar Produtos (`DELETE`):** Endpoint para exclusão segura de registros do banco de dados.

---

## 🏛️ Detalhes Técnicos & Arquitetura

Para garantir uma aplicação organizada e de fácil manutenção, o projeto seguiu o padrão de **Arquitetura em Camadas**:

1. **Model (Entity):** Classe Java que representa a tabela de produtos no banco de dados, mapeada utilizando as anotações do JPA/Hibernate.
2. **Repository:** Interface que estende `JpaRepository`, fornecendo todos os métodos de persistência SQL prontos, além de consultas customizadas por nome.
3. **Service:** Camada onde reside a lógica do sistema e o controle transacional rigoroso com o uso do Spring `@Transactional` para garantir a sincronia e integridade dos dados.
4. **Controller (API):** A porta de entrada da aplicação (`ProdutoApi`), responsável por expor as URLs e receber/responder as requisições HTTP (JSON).

### ⚡ Otimização com Lombok
Nesta fase inicial, o **Lombok** foi integrado de forma cirúrgica na camada de serviços e modelos para automatizar a geração de rotinas repetitivas como `Getters` e `Setters`, mantendo o código limpo, legível e otimizando o tempo de desenvolvimento.

---

## 🔧 Tecnologias Utilizadas

* **Java 21**
* **Spring Boot 3**
* **Spring Data JPA** (Hibernate)
* **Banco de Dados em Memória H2** 
* **Lombok**
* **Postman** (Client HTTP utilizado para testar e validar todos os endpoints do CRUD)

---

## 🔄 Conclusão desta Fase

Este repositório marca o encerramento com sucesso da **Fase 1** do treinamento. Todo o fluxo essencial de manipulação de dados foi testado e validado via Postman, garantindo uma fundação sólida em APIs RESTful e Spring Boot para os próximos módulos do curso.

---
💡 *Fase 1 concluída com sucesso. Pronto para iniciar o próximo repositório focado em arquiteturas mais robustas, microsserviços, DTOs e segurança avançada!*