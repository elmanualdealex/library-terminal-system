# 📚 Library Terminal System

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-blue?logo=postgresql)
![Maven](https://img.shields.io/badge/Maven-Build-red?logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-green)

A command-line **Library Management System** built in **Java** with **PostgreSQL**, connected via **JDBC**.

Built to practice backend fundamentals — SQL, CRUD, JDBC, clean code structure, and Git — before moving on to Spring Boot.

---

## ✨ Features

| Feature | Description |
|---|---|
| 📖 Create | Add a new book |
| 📚 List | Show all books |
| ✏️ Update | Edit an existing book |
| 🗑 Delete | Remove a book |
| ✅ Validation | Basic input checks |
| 💻 CLI menu | Interactive terminal interface |
| 🗄 Storage | Persistent, backed by PostgreSQL |

---

## 🛠 Tech Stack

| Technology | Version | Role |
|---|---|---|
| Java | 21 | Language / runtime |
| PostgreSQL | 16 | Database |
| JDBC | PostgreSQL Driver | DB connectivity |
| Maven | Latest | Build tool |
| IntelliJ IDEA | — | IDE (optional) |

---

## 📂 Project Structure

```text
src
└── main
    └── java
        └── com.elmanualdealex
            ├── Main.java             # Entry point, CLI menu loop
            ├── Book.java             # Book model
            ├── BookRepository.java   # CRUD logic (DB access layer)
            └── DB.java               # Connection config
```

**Pattern:** `Main` → `BookRepository` → `DB` → PostgreSQL. Each class has one job — no logic bleeding between layers.

---

## 🗄 Database Setup

```sql
CREATE DATABASE library;

CREATE TABLE books (
    id INT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255)
);
```

Run this once in `psql` (or your DB client of choice) before starting the app.

---

## ⚙️ Configuration

Set your credentials in `DB.java`:

```java
private static final String URL = "jdbc:postgresql://localhost:5432/library";
private static final String USER = "your_username";
private static final String PASSWORD = "your_password";
```

> ⚠️ These are hardcoded for simplicity in this learning project. In production, move them to environment variables or a config file excluded from Git.

---

## 🚀 Getting Started

```bash
# 1. Clone
git clone git@github.com:elmanualdealex/library-terminal-system.git
cd library-terminal-system

# 2. Build
mvn compile

# 3. Run
mvn exec:java
```

Alternatively, run `Main.java` directly from IntelliJ IDEA.

**Prerequisites:** Java 21, PostgreSQL 16 running locally, Maven installed.

---

## 📸 Preview

**Main menu:**
```text
📚 LIBRARY SYSTEM
1. Add book
2. Show books
3. Delete book
4. Modify book
5. Exit
```

**Example run:**
```text
1. Add book
ID: 1
Title: Clean Code
Author: Robert C. Martin
Book added successfully
```

**Resulting row:**

| id | title | author |
|---:|---|---|
| 1 | Clean Code | Robert C. Martin |

---

## 📖 What I Learned

- Java OOP fundamentals
- JDBC (raw DB connectivity, no ORM)
- SQL CRUD operations
- PostgreSQL setup and management
- Exception handling
- Repository pattern (separating DB logic from business logic)
- CLI application design
- Git & GitHub workflows
- Maven build lifecycle

---

## 🛣 Roadmap

**Done:**
- [x] CRUD operations
- [x] PostgreSQL integration
- [x] JDBC connectivity
- [x] Input validation

**Next:**
- [ ] Search books
- [ ] Pagination
- [ ] Unit testing (JUnit)
- [ ] Logging
- [ ] Migrate to Spring Boot
- [ ] REST API
- [ ] Docker support

---

## 👨‍💻 Author

**Alex**
GitHub: [github.com/elmanualdealex](https://github.com/elmanualdealex)

## License

MIT
