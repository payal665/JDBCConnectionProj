# JDBCConnectionProj

# 📚 Library Management System

A simple Library Management System built using **Core Java** and **MySQL**. This project allows users to perform essential operations related to managing books in a library, such as adding, updating, viewing, and deleting book records.

## 🚀 Features

- Add new books to the library
- View list of all books
- Update book details
- Delete books from the library
- User-friendly console interface
- MySQL integration for data storage

## 🛠️ Tech Stack

- **Language:** Java (Core Java)
- **Database:** MySQL
- **IDE:** Eclipse / IntelliJ IDEA / NetBeans
- **JDBC:** For database connectivity

## 🧩 Project Structure

LibraryManagement/ ├── src/ │ └── LibraryManager.java │ └── Book.java │ └── DatabaseConnection.java ├── lib/ (if JDBC driver is added) ├── README.md


## 📦 Database Schema

**Database Name:** `librarydb`  
**Table Name:** `books`

```sql
CREATE DATABASE librarydb;

USE librarydb;

CREATE TABLE books (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    author VARCHAR(100),
    publisher VARCHAR(100),
    quantity INT
);
