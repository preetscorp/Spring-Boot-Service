package com.book.book.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.book.model.Book;
import com.book.book.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/getBooks")
	public List<Book> getAllBooks() {
		System.out.println("!!Entering BookController!!");
		return bookService.getAllBooks();
	}
	
	@PostMapping("/book")
	public ResponseEntity<Book> addBook(@RequestBody Book b) { /* RequestBody is used for getting the body of request*/
			
		Book b1 = bookService.addBooks(b);
		return new ResponseEntity<Book>(b1, HttpStatus.CREATED);
	}
	
	@PutMapping("/updateBook")
	public ResponseEntity<Book> updateBook(@RequestBody Book b){
		Book b2 = bookService.updateBooks(b);
		return new ResponseEntity<Book>(b2, HttpStatus.OK);
	}
}

