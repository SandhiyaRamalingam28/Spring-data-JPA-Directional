package com.example.springJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springJPA.model.Book;
import com.example.springJPA.repository.BookRepository;


@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/Bi/Books")
	public ResponseEntity<List<Book>> createEmployee(@RequestBody List<Book> user) {
		List<Book> actualUser = bookRepository.saveAll(user);
		return ResponseEntity.ok(actualUser);
	}
	

}
