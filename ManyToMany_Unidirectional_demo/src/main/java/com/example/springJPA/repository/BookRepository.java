package com.example.springJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springJPA.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
