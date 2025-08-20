# Bootcamp: NTT-Data com java para Iniciantes

# Creditos: Digital Innovation One, NTT-DATA, professores e colegas de bootcamp

# 💻 Projeto Prático: Criando um Aplicativo de Controle de Transações Bancárias com Java e POO

Neste projeto, vamos desenvolver juntos um **aplicativo de controle de contas bancárias**, aplicando os principais conceitos de **Programação Orientada a Objetos (POO)** com **Java moderno (Java 21)** e ferramentas do ecossistema **Spring**. Será uma ótima oportunidade para aplicar teoria na prática e construir uma aplicação completa, com persistência de dados e uma interface de interação com o usuário.

---

## 🧰 Ferramentas e Tecnologias Utilizadas

Durante o projeto, vamos trabalhar com as seguintes ferramentas e tecnologias:

* **Java 21**
* **IDE IntelliJ IDEA** (pode ser Community ou Ultimate)
* **Spring Initializr** para geração do projeto base com Maven
* **Maven** como gerenciador de dependências
* **Lombok** para reduzir boilerplate (getters, setters, construtores)
* **Spring Boot** para facilitar a estruturação do projeto
* **Spring Data JPA** para persistência de dados
* **SQLite** como banco de dados local e leve
* **Interface de Usuário via Scanner (CLI)** no console
* Estrutura modular com **camadas de modelo, serviço e repositório**

---

## 🎯 Objetivo do Projeto

O objetivo é simular o funcionamento de um banco fictício, onde o usuário poderá realizar operações como:

* Criar uma nova conta bancária
* Consultar saldo
* Realizar depósitos e saques
* Buscar contas por número ou titular
* Excluir contas
* Listar todas as contas

---

## 🧩 Estrutura das Etapas do Projeto

O projeto será dividido em etapas, cada uma com um post separado, permitindo o desenvolvimento passo a passo. Abaixo estão as etapas que iremos seguir:

### 1. **Planejamento e Diagrama do Projeto**

* Explicação geral do sistema
* Apresentação do **diagrama de classes**
* Entendimento dos papéis de cada classe e função no sistema

### 2. **Criação do Projeto com Spring Initializr**

* Geração do projeto com Maven
* Escolha das dependências corretas (Spring Web, JPA, Lombok)
* Estrutura inicial do projeto

### 3. **Criação das Classes de Modelo**

* Definição das entidades principais do sistema (ex: Conta)
* Atributos e comportamentos das entidades
* Aplicação de boas práticas de POO

### 4. **Implementação da Lógica de Negócio**

* Criação dos serviços que controlam as operações do sistema
* Implementação das funcionalidades como depósito, saque, listagem, etc.

### 5. **Criação da Interface via Terminal (CLI)**

* Utilização do Scanner para interação com o usuário
* Menu de opções para executar operações bancárias

### 6. **Integração com Banco de Dados SQLite**

* Configuração do SQLite com Spring Data JPA
* Salvando, consultando e removendo dados reais no banco

### 7. **Testes das Funcionalidades**

* Execução prática das operações
* Verificação da persistência de dados
* Teste com diferentes tipos de entradas

### 8. **Refinamento Final e Considerações**

* Ajustes na estrutura do projeto
* Possíveis melhorias ou expansões futuras (como interface gráfica ou API REST)

---

## 📘 Diagrama Conceitual do Projeto

Vamos iniciar com um **diagrama simples de classes**, que representa as principais entidades e como elas se relacionam:

```
+-------------------+
|      Conta        |
+-------------------+
| numero            |
| titular           |
| saldo             |
+-------------------+

+--------------------------+
|     BancoService         |
+--------------------------+
| contas (lista de Conta)  |
| adicionarConta()         |
| removerConta()           |
| buscarConta()            |
| depositar()              |
| sacar()                  |
| consultarSaldo()         |
+--------------------------+
```

Esse diagrama nos ajudará a visualizar a estrutura geral do projeto antes de iniciarmos o desenvolvimento.

---

## 🚀 Vamos Começar!

Nos próximos posts, vamos explorar **cada etapa em detalhes**, com exemplos e explicações práticas para que você possa acompanhar e desenvolver o projeto junto comigo.

Esse projeto é ideal para fixar os conceitos de:

* Encapsulamento
* Reuso de código
* Boas práticas com classes e métodos
* Persistência de dados com SQLite
* Separação de responsabilidades

Fique ligado e vamos construir esse sistema passo a passo! 💪

---

