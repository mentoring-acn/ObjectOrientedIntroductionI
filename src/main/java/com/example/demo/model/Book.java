package com.example.demo.model;

import java.util.Objects;

public class Book {
	
	String title;
	String author;
	String isbn;
	
	public Book(String title, String author, String isbn) {
		//EXERCISE: Add code here
		
	}

	public String getTitle() {
		return title;
		
	}

	public void setTitle(String title) {
		this.title=title;
		
	}

	public String getAuthor() {
		//EXERCISE: Add code here
		
	}

	public void setAuthor(String author) {
		//EXERCISE: Add code here
		
	}

	public String getIsbn() {
		//EXERCISE: Add code here
		
	}

	public void setIsbn(String isbn) {
		//EXERCISE: Add code here
		
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, isbn, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(isbn, other.isbn)
				&& Objects.equals(title, other.title);
	}
	
	
	
}
