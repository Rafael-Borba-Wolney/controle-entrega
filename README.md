# Sistema de Controle de Entrega

Projeto desenvolvido em Java com Spring Boot, HTML, CSS e MySQL para a atividade acadêmica.

## Funcionalidades

- Login simples
- Controle de sessão
- Logout
- Dashboard inicial
- Cadastro de endereço
- Cadastro de mercadoria
- Vínculo 1 para 1 entre mercadoria e endereço
- Listagem de endereços
- Listagem de mercadorias

## Login do sistema

- Usuário: `admin`
- Senha: `12345678`

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- HTML
- CSS
- MySQL
- Maven

## Requisitos atendidos

- Repositório no GitHub
- Sistema de controle de entrega
- Cadastro de mercadoria com no mínimo 5 campos
- Cadastro de endereço com:
  - Logradouro
  - Complemento
  - Número
  - CEP
  - Cidade
  - Estado
- Vínculo entre mercadoria e endereço
- Relacionamento 1 para 1
- Mínimo de 5 commits
- Uso da branch `release-dev`
- Merge para `main` via Pull Request

## Como executar

1. Criar o banco `controle_entrega` no MySQL.
2. Configurar usuário e senha do banco em `application.properties`.
3. Rodar o projeto com:

```bash
mvn spring-boot:run

Acessar no navegador: http://localhost:8080

Projeto finalizado para entrega.
