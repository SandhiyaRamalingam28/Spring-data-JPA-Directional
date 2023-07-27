package com.example.springJPA.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Book_ManyToMany_uni")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookId;
	private String bookName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="author_book_ManyToMany_uni",
			joinColumns = @JoinColumn(name="book_id"),
			inverseJoinColumns = @JoinColumn(name="author_id")
			)
	private List<Author> authors;

	
	
	public Book() {
	}

	public Book(Long bookId, String bookName, List<Author> authors) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authors = authors;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	

}
