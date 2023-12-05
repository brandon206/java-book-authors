package com.bpark.database.dao;

import com.bpark.database.domain.Book;

import java.util.Optional;

public interface BookDao {
    void create(Book book);
    Optional<Book> find(String isbn);
}
