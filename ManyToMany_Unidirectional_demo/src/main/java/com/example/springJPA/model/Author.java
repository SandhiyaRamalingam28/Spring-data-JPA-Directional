package com.example.springJPA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Author_ManyToMany_uni")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long authorId;
	private String authorName;
	

	public Author() {
	}

	public Author(Long authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	
}
