# 📚 Library Terminal System

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-blue?logo=postgresql)
![Maven](https://img.shields.io/badge/Maven-Build-red?logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-green)

A command-line **Library Management System** developed in **Java** with **PostgreSQL** using **JDBC**.

This project was created to practice backend development fundamentals, including SQL, CRUD operations, JDBC, clean code organization, and Git workflows before moving to Spring Boot.

---

## ✨ Features

- 📖 Create books
- 📚 List all books
- ✏️ Update existing books
- 🗑 Delete books
- 🗄 Persistent storage with PostgreSQL
- ✅ Input validation
- 💻 Interactive terminal menu

---

## 🛠 Tech Stack

| Technology | Version |
|------------|---------|
| Java | 21 |
| PostgreSQL | 16 |
| JDBC | PostgreSQL Driver |
| Maven | Latest |
| IntelliJ IDEA | IDE |

---

## 📂 Project Structure

```text
src
└── main
    └── java
        └── com.elmanualdealex
            ├── Main.java
            ├── Book.java
            ├── BookRepository.java
            └── DB.java
```

---

## 🗄 Database

```sql
CREATE DATABASE library;

CREATE TABLE books (
    id INT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255)
);
```

---

## ⚙️ Configuration

Edit `DB.java`

```java
private static final String URL = "jdbc:postgresql://localhost:5432/library";
private static final String USER = "your_username";
private static final String PASSWORD = "your_password";
```

---

## 🚀 Getting Started

Clone the repository

```bash
git clone git@github.com:elmanualdealex/library-terminal-system.git
```

Go to the project

```bash
cd library-terminal-system
```

Run

```bash
mvn compile
mvn exec:java
```

or simply run `Main.java` from IntelliJ IDEA.

---

## 📸 Preview

### Main Menu

```text
📚 LIBRARY SYSTEM

1. Add book
2. Show books
3. Delete book
4. Modify book
5. Exit
```

### Example

```text
1. Add book

ID: 1
Title: Clean Code
Author: Robert C. Martin

Book added successfully
```

### Database

| id | title | author |
|---:|-------|--------|
| 1 | Clean Code | Robert C. Martin |

---

## 📖 What I Learned

- Java OOP
- JDBC
- SQL CRUD
- PostgreSQL
- Exception handling
- Git & GitHub
- Maven
- Repository pattern
- CLI application design

---

## 🛣 Roadmap

- [x] CRUD
- [x] PostgreSQL integration
- [x] JDBC
- [x] Input validation
- [ ] Search books
- [ ] Pagination
- [ ] Unit testing (JUnit)
- [ ] Logging
- [ ] Spring Boot migration
- [ ] REST API
- [ ] Docker support

---

## 👨‍💻 Author

**Alex**

GitHub: https://github.com/elmanualdealex
