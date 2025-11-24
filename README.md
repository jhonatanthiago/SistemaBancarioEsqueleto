# 🏦 Sistema Bancário Digital — Checkpoint LP II

Este projeto é um **sistema bancário simples**, desenvolvido para o *Checkpoint da disciplina de Linguagem de Programação II*, utilizando **Java** e arquitetura em camadas.
O objetivo é demonstrar o início do desenvolvimento e o “estado da arte” do projeto, com organização adequada e funções básicas implementadas.

---

## 📌 Tecnologias utilizadas

* **Java 17+**
* **Eclipse IDE**
* Arquitetura em camadas:

  * `model`
  * `repository`
  * `service`
  * `controller`

---

## 📁 Estrutura do projeto

```
src/
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

---

## 🧩 Funcionalidades implementadas

O sistema, até o momento, permite:

✔ Criar contas
✔ Depositar valores
✔ Sacar valores (com verificação de saldo)
✔ Consultar saldo
✔ Buscar contas por número
✔ Exibir resultado das operações no console

---

## 📝 Descrição das camadas

### 🔹 **Model (`Conta.java`)**

Representa a entidade Conta, contendo:

* número da conta
* nome do dono
* saldo
* métodos para depositar e sacar

---

### 🔹 **Repository (`ContaRepository.java`)**

Simula um “banco de dados” em memória com:

* lista de contas
* salvar novas contas
* buscar contas pelo número

---

### 🔹 **Service (`ContaService.java`)**

Contém a **regra de negócio**, como:

* criar conta
* fazer depósitos
* realizar saques
* consultar saldo
* validar se a conta existe

---

### 🔹 **Controller (`ContaController.java`)**

Faz a ponte entre o usuário e o service.
Aqui é onde os métodos do sistema são chamados.

---

### 🔹 **Main.java**

Classe usada apenas para **testar o sistema** e gerar a saída usada no vídeo do checkpoint.

Exemplo de teste:

```java
controller.criarConta("123", "Thiago");
controller.depositar("123", 100);
controller.consultar("123");
controller.sacar("123", 50);
controller.consultar("123");
```

---

## ▶ Como executar

1. Abra o projeto no **Eclipse**
2. Verifique se o **JDK 17+** está configurado
3. Rode a classe **Main.java**
4. As operações serão exibidas no console

---

## 🚧 Próximos passos (planejamento)

Para as próximas etapas do projeto, serão adicionados:

🔸 Persistência de dados (arquivo ou banco de dados)
🔸 API REST usando Spring ou Jakarta EE (dependendo da orientação do professor)
🔸 Interface gráfica ou interface web
🔸 Sistema de login
🔸 Múltiplos tipos de contas
🔸 Histórico de transações

---

## 👨‍💻 Autor

**Jhonatan Thiago**
Curso: Tecnologia da Informação — UFRN
