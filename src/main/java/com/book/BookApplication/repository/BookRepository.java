package com.book.BookApplication.repository;

import com.book.BookApplication.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    public Book findBookByTitle(String title);
}