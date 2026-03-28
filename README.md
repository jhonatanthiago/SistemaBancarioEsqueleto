# 💳 Sistema Bancário Digital API

Projeto desenvolvido na disciplina de Linguagem de Programação II  
Aluno: Jhonatan Thiago  

---

## 📌 Sobre o Projeto

Este projeto consiste em uma API REST de um sistema bancário digital, desenvolvida em Java com Spring Boot.

A aplicação simula operações bancárias essenciais, como criação de contas, consultas, depósitos e saques, aplicando conceitos de Programação Orientada a Objetos (POO), arquitetura em camadas e boas práticas de desenvolvimento back-end.

O sistema foi projetado com foco em organização, escalabilidade e facilidade de manutenção, estando preparado para futura integração com banco de dados.

---

## 🚀 Funcionalidades

- Criar conta bancária  
- Listar contas cadastradas  
- Buscar conta por número  
- Realizar depósitos  
- Realizar saques  

---

## 🧱 Estrutura do Projeto

O sistema foi organizado em camadas seguindo boas práticas de desenvolvimento:

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

````

### 🔹 Model
Representa as entidades do sistema.  
Ex: `Conta.java` contém dados como número, titular, saldo e tipo.

### 🔹 Repository
Responsável pelo gerenciamento dos dados (armazenados em memória durante a execução).

### 🔹 Service
Contém as regras de negócio, como operações de depósito, saque e consultas.

### 🔹 Controller
Responsável por expor a API REST, permitindo comunicação via HTTP.

### 🔹 Main
Classe responsável por iniciar a aplicação Spring Boot.

---

## 🔗 Endpoints da API

| Método | Rota | Descrição |
|--------|------|----------|
| POST   | /contas | Criar conta |
| GET    | /contas | Listar contas |
| GET    | /contas/{numero} | Buscar conta |
| POST   | /contas/{numero}/depositar | Depositar |
| POST   | /contas/{numero}/sacar | Sacar |

---

## 🛠 Tecnologias Utilizadas

- Java 21  
- Spring Boot  
- Maven  
- API REST  
- Arquitetura em camadas  
- Git e GitHub  

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)  
- Separação de responsabilidades  
- Desenvolvimento de APIs REST  
- Organização em camadas  
- Boas práticas de desenvolvimento  

---

## ▶️ Como Executar o Projeto

### 🔧 Requisitos

- Java 21+  
- Maven instalado  
- IDE (VS Code, IntelliJ ou Eclipse)

### ▶️ Execução

```bash
mvn spring-boot:run
````

Após iniciar, a aplicação estará disponível em:

```
http://localhost:8080
```

---

## 🧪 Testando a API

Recomenda-se o uso de ferramentas como:

* Postman
* Insomnia

Exemplo com curl:

```bash
curl -X GET http://localhost:8080/contas
```

---

## 📈 Possíveis Melhorias

* Integração com banco de dados (PostgreSQL)
* Uso de JPA/Hibernate
* Implementação de autenticação (Spring Security)
* Criação de testes automatizados (JUnit)
* Documentação da API (Swagger)

---

## 🎥 Demonstração

Vídeo explicando o projeto:
[https://drive.google.com/file/d/1kBRnGe7M5K8cvLBMxvxsVXEdqGZar3_i/view](https://drive.google.com/file/d/1kBRnGe7M5K8cvLBMxvxsVXEdqGZar3_i/view)

---

## 📄 Observação

Projeto acadêmico desenvolvido com foco em aprendizado prático de desenvolvimento back-end, com ênfase na construção de APIs REST e organização de sistemas em camadas.

---

## 👨‍💻 Autor

Jhonatan Thiago
[https://github.com/jhonatanthiago](https://github.com/jhonatanthiago)
