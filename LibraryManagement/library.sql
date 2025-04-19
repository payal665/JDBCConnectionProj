
CREATE DATABASE IF NOT EXISTS library;
USE library;

CREATE TABLE IF NOT EXISTS books (
    book_id INT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    quantity INT
);

CREATE TABLE IF NOT EXISTS issued_books (
    issue_id INT PRIMARY KEY AUTO_INCREMENT,
    book_id INT,
    student_name VARCHAR(100),
    issue_date DATE,
    return_date DATE,
    FOREIGN KEY (book_id) REFERENCES books(book_id)
);
