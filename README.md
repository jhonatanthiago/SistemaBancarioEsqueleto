# 📘 Sistema Bancário Digital

Projeto da disciplina **Linguagem de Programação II**
Aluno: **Jhonatan Thiago**

---

## 📌 Sobre o Projeto

Este projeto é um **Sistema Bancário Digital** desenvolvido em **Java** utilizando **Maven** e **Spring Boot**.
Seu objetivo é simular operações bancárias básicas, como **cadastro de contas**, **consulta**, **depósito** e **saque**, aplicando conceitos de Programação Orientada a Objetos, camadas e API REST.

O projeto não foi totalmente finalizado, mas encontra-se em **estágio avançado**, com toda a estrutura pronta, classes organizadas e API configurada para execução.

🎥 Vídeo Explicando o Projeto:
👉 https://drive.google.com/file/d/1kBRnGe7M5K8cvLBMxvxsVXEdqGZar3_i/view?usp=sharing

---

## 🧱 Estrutura do Projeto

O sistema foi organizado em camadas conforme boas práticas:

```
src/main/java/com/sistemabancario/
 ├── model/
 │     └── Conta.java
 ├── repository/
 │     └── ContaRepository.java
 ├── service/
 │     └── ContaService.java
 ├── controller/
 │     └── ContaController.java
 └── Main.java
```

### ✔️ **model**

Contém a classe `Conta`, que representa uma conta bancária com dados como número, titular, saldo e tipo.

### ✔️ **repository**

Armazena as contas em memória durante a execução do programa.

### ✔️ **service**

Contém as regras de negócio (depósito, saque, busca de contas, etc).

### ✔️ **controller**

Exposição da API REST, permitindo chamadas HTTP como:

* `POST /contas`
* `GET /contas`
* `GET /contas/{numero}`
* `POST /contas/{numero}/depositar`
* `POST /contas/{numero}/sacar`

### ✔️ **Main.java**

Classe responsável por iniciar o Spring Boot.
Ao rodar, aparece no terminal:

```
=== Sistema Bancario Digital API rodando ===
```

---

## 🚀 Como Rodar o Projeto

### 🔧 Requisitos

* Java 21+
* Maven instalado
* VS Code ou IntelliJ/Eclipse
* Extensão Spring Boot ou plugin Java

### ▶️ Executar o Projeto

```bash
mvn spring-boot:run
```

Se tudo carregar corretamente, você verá no terminal:

```
Tomcat started on port 8080
=== Sistema Bancario Digital API rodando ===
```

---

## 🧪 Testes da API (sem usar navegador)

Como o navegador não reconhece rotas REST, o ideal seria usar:

* Postman
* Insomnia
* Curl

Exemplo usando curl:

```bash
curl -X GET http://localhost:8080/contas
```

---

## ⚠️ Observação Importante

O projeto encontra-se em estágio avançado de desenvolvimento, com arquitetura estruturada em camadas e implementação de uma API REST funcional, permitindo fácil expansão e integração com banco de dados e novas funcionalidades.

O foco da entrega foi:

* aplicação dos conceitos de POO,
* organização em camadas,
* uso de Maven,
* uso de Spring Boot,
* e construção de uma API REST completa.

---

## 📄 Licença

Projeto acadêmico — livre para estudo.
