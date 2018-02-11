package com.book.book.jpa;

import org.springframework.data.repository.CrudRepository;

import com.book.book.model.Book;
public interface BookRepository extends CrudRepository<Book, Integer>{

}
