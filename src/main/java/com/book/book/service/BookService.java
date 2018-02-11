package com.book.book.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.book.jpa.BookRepository;
import com.book.book.model.Book;

@Service
public class BookService {
	@Autowired
	BookRepository repository;
	
	public List<Book> getAllBooks() {
		System.out.println("!!Entering BookService!!");
		List<Book> list  = new ArrayList<>();
		
		repository.findAll().forEach(list::add); /* New Java8 feature : Lamba expressions*/
		return list;
	}
	
	public Book addBooks(Book b) {
		return repository.save(b);
	}
	public Book updateBooks(Book b) {
		return repository.save(b);
	}
}
