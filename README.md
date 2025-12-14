# Busca GitHub

## 📌 Descrição

**Busca GitHub** é uma aplicação desenvolvida em **Java** que consome a **API pública do GitHub** para realizar a busca de usuários. A aplicação envia requisições HTTP para a API, processa as respostas retornadas em formato JSON e converte esses dados em objetos Java.

Quando um usuário não é encontrado ou ocorre algum problema na requisição, a aplicação trata esse cenário lançando uma **exceção personalizada**, garantindo maior controle de erros e um comportamento previsível do sistema.

---

## 🚀 Funcionalidades

* 🔍 Consulta de usuários do GitHub a partir do **username**
* 🌐 Consumo da **GitHub REST API**
* 🔄 Conversão de JSON para objetos Java
* ❌ Lançamento de **exceção** quando o usuário não é encontrado
* 🧩 Código organizado e orientado a objetos

---

## 📦 Como usar no seu próprio projeto

Esta aplicação pode ser facilmente reutilizada em outros projetos Java que precisem consumir dados de usuários do GitHub.

### 1️⃣ Pré-requisitos

* Java 11 ou superior
* Conexão com a internet
* Biblioteca **Gson** adicionada ao projeto

---

### 2️⃣ Clonar o repositório

```bash
git clone https://github.com/Arthurtrin/Busca-GitHub.git
```

---

### 3️⃣ Integrar ao seu projeto

Você pode:

* Copiar as classes responsáveis pela requisição HTTP
* Reutilizar o modelo de usuário (classe que representa o usuário do GitHub)
* Utilizar a exceção personalizada para tratar erros de busca

---

### 4️⃣ Exemplo de uso

```java
String json = GithubService.userSearch("octocat");
try{
    GithubUser githubUser = new GithubUser(GithubService.jsonToGithubUser(json));
    System.out.println(githubUser);
}catch(UserNotFound e){
    System.out.println(e.getMessage());
}

```

---

### 5️⃣ Tratamento de exceções

Caso o usuário informado não exista ou a API não retorne sucesso, a aplicação lança uma **exception**, permitindo que o projeto que a utiliza trate o erro da forma que preferir.

---

## 🛠️ Tecnologias Utilizadas

* **Java**
* **HTTP Client** (requisições à API)
* **Gson** (serialização e desserialização de JSON)
* **Git & GitHub** (versionamento de código)

---

## ⚠️ Tratamento de Erros

A aplicação implementa um tratamento de erros para cenários como:

* Usuário inexistente no GitHub
* Falha na comunicação com a API
* Respostas inválidas

Nesses casos, é lançada uma **exception**, permitindo que o erro seja tratado de forma clara e controlada pela aplicação.

---

## 📂 Objetivo do Projeto

Este projeto tem como objetivo:

* Praticar o consumo de **APIs REST**
* Aplicar conceitos de **orientação a objetos** em Java
* Trabalhar com **exceções personalizadas**
* Servir como **projeto de portfólio**, demonstrando integração com serviços externos

---

## 👤 Autor

Desenvolvido por **Arthur Trindade**

📎 GitHub: [https://github.com/Arthurtrin](https://github.com/Arthurtrin)

---

## 📄 Observações

Este projeto utiliza a **API pública do GitHub**, que possui limite de requisições para chamadas não autenticadas. Para uso mais intenso, recomenda-se a utilização de um token de autenticação.
