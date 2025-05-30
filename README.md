# 🎮 DSList - Catálogo de Jogos com Spring Boot

Este é um projeto backend desenvolvido com **Java 17** e **Spring Boot**, que permite gerenciar listas de jogos. A aplicação fornece uma API RESTful para listar jogos, visualizar listas e reordenar jogos dentro das listas.

> Projeto desenvolvido durante o **Intensivão Java Spring** promovido pela [DevSuperior](https://devsuperior.com.br).

---

## 🚀 Descrição do Projeto

O objetivo do projeto é simular um sistema de listas de jogos (como "Top 10 RPGs", "Favoritos", etc.), onde cada jogo pode estar em uma ou mais listas, com posição específica. A aplicação expõe uma API REST para:

- Consultar jogos
- Consultar listas de jogos
- Reordenar os jogos dentro de uma lista específica

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Banco H2 (para testes)**
- **Maven**
- **Postman (para testar a API)**

---

## 📁 Estrutura do Projeto

```bash
dslist/
├── src/
│   ├── main/
│   │   ├── java/com/devsuperior/dslist/
│   │   │   ├── controllers/      # Controladores REST
│   │   │   ├── dto/              # Data Transfer Objects
│   │   │   ├── entities/         # Entidades JPA
│   │   │   ├── projections/      # Projeções SQL nativas
│   │   │   ├── repositories/     # Interfaces de acesso ao banco
│   │   │   └── services/         # Regras de negócio
│   │   └── resources/
│   │       └── application-*.properties  # Configurações por ambiente
└── import.sql                    # Script para popular o banco
```

---

## 🧪 Como Rodar o Projeto

### Pré-requisitos

- Java 17+
- Maven
- PostgreSQL

### Passos para execução

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/GiovannyEnes/dslist.git
   cd dslist
   ```

2. **Configure o banco de dados**:
   Edite o arquivo `src/main/resources/application-dev.properties` com suas credenciais do PostgreSQL.

3. **Execute o projeto**:
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Acesse os endpoints**:
   A API estará disponível em: `http://localhost:8080`

---

## 🌐 Endpoints Principais

- `GET /games` - Lista todos os jogos
- `GET /games/{id}` - Detalhes de um jogo
- `GET /lists` - Lista todas as listas
- `GET /lists/{listId}/games` - Jogos de uma lista específica
- `POST /lists/{listId}/replacement` - Reordena os jogos na lista

---

## 📌 Observações

- O projeto possui suporte a múltiplos perfis (`test`, `dev`, `prod`)
- Dados de exemplo são carregados automaticamente com `import.sql`
- A estrutura permite fácil integração com um front-end (em breve!)

---

## 👨‍💻 Autor

Desenvolvido por **Giovanny Enes**  
GitHub: [@GiovannyEnes](https://github.com/GiovannyEnes)

---