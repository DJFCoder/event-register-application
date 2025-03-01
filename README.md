# Event Register API

An event management system API built with Spring Boot, allowing users to create events and manage subscriptions.

## Features

- Create new events with details like title, location, price, and dates
- Generate SEO-friendly URLs for events automatically
- List all available events
- Find events by pretty name
- Subscribe users to events
- Handle subscription conflicts and validations

## Technologies

- **Java** - Programming language
- **Spring Boot** - Framework
- **Spring Data JPA** - Data persistence
- **MySQL** - Database
- **Docker** - Containerization

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- Docker & Docker Compose

### Running the Database

The project uses MySQL 8.4 in a Docker container:

```bash
docker-compose up -d
```

This starts a MySQL server accessible on port 3336.

### Database Schema

The database structure includes:
- `tbl_event` - Stores event details
- `tbl_user` - Stores user information
- `tbl_subscription` - Manages event subscriptions

### Running the Application

```bash
mvn spring-boot:run
```

## API Endpoints

### Events

- **GET /events** - List all events
- **GET /events/{prettyName}** - Get event by its pretty name
- **POST /events** - Create a new event

Example request for creating an event:
```json
{
  "title": "CodeCraft Summit 2027",
  "location": "Online",
  "price": 0.0,
  "startDate": "2027-03-16",
  "endDate": "2027-03-18",
  "startTime": "19:00:00",
  "endTime": "21:00:00"
}
```

### Subscriptions

- **POST /subscription/{prettyName}** - Subscribe a user to an event

Example request for subscribing a user:
```json
{
  "name": "John Doe",
  "email": "john@example.com"
}
```

---

# API de Registro de Eventos

Um sistema de gerenciamento de eventos construído com Spring Boot, permitindo aos usuários criar eventos e gerenciar inscrições.

## Funcionalidades

- Criar novos eventos com detalhes como título, localização, preço e datas
- Gerar URLs amigáveis para SEO automaticamente
- Listar todos os eventos disponíveis
- Encontrar eventos pelo nome amigável
- Inscrever usuários em eventos
- Tratamento de conflitos e validações de inscrição

## Tecnologias Utilizadas

- **Java** - Linguagem de programação
- **Spring Boot** - Framework
- **Spring Data JPA** - Persistência de dados
- **MySQL** - Banco de dados
- **Docker** - Containerização

## Começando

### Pré-requisitos

- Java 17 ou superior
- Maven
- Docker & Docker Compose

### Executando o Banco de Dados

O projeto utiliza MySQL 8.4 em um contêiner Docker:

```bash
docker-compose up -d
```

Isso inicia um servidor MySQL acessível na porta 3336.

### Esquema do Banco de Dados

A estrutura do banco de dados inclui:
- `tbl_event` - Armazena detalhes dos eventos
- `tbl_user` - Armazena informações de usuários
- `tbl_subscription` - Gerencia inscrições em eventos

### Executando a Aplicação

```bash
mvn spring-boot:run
```

## Endpoints da API

### Eventos

- **GET /events** - Listar todos os eventos
- **GET /events/{prettyName}** - Obter evento pelo seu nome amigável
- **POST /events** - Criar um novo evento

Exemplo de requisição para criar um evento:
```json
{
  "title": "CodeCraft Summit 2027",
  "location": "Online",
  "price": 0.0,
  "startDate": "2027-03-16",
  "endDate": "2027-03-18",
  "startTime": "19:00:00",
  "endTime": "21:00:00"
}
```

### Inscrições

- **POST /subscription/{prettyName}** - Inscrever um usuário em um evento

Exemplo de requisição para inscrever um usuário:
```json
{
  "name": "João Silva",
  "email": "joao@exemplo.com"
}
```
