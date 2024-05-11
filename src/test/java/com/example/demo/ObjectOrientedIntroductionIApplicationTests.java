package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Book;
import com.example.demo.model.Library;

@SpringBootTest
class ObjectOrientedIntroductionIApplicationTests {

	@Test
	void addBookTest() {
		Library library = new Library();
		Book book1= new Book("Test1","Test1","Test1");
		Book book2= new Book("Test2","Test2","Test2");
		Book book3= new Book("Test3","Test3","Test3");
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		assertEquals(library.getBooks().size(),3);
		assertTrue(library.containsBook(book1));
		assertTrue(library.containsBook(book2));
		assertTrue(library.containsBook(book3));
		
	}
	
	@Test
	void removeBookTest() {
		Library library = new Library();
		
		Book book1 = new Book("Test1","Test1","Test1");
		Book book2 = new Book("Test2","Test2","Test2");
		library.addBook(book1);
		library.addBook(book2);
		library.removeBook(book1);
		
		assertEquals(library.getBooks().size(),1);
		assertFalse(library.containsBook(book1));
		assertTrue(library.containsBook(book2));
	}
	
	@Test
	void searchByTitleTest() {
		Library library = new Library();
		
		Book book1 = new Book("Test1","Test1","Test1");
		Book book2 = new Book("Test2","Test2","Test2");
		library.addBook(book1);
		library.addBook(book2);
		
		Book found = library.searchByTitle("Test2");
		
		assertNotNull(found);
		assertEquals(found.getTitle(),"Test2");
	}
	
	@Test
	void searchByTitleNullTest() {
		Library library = new Library();
		
		Book book1 = new Book("Test1","Test1","Test1");
		Book book2 = new Book("Test2","Test2","Test2");
		library.addBook(book1);
		library.addBook(book2);
		
		Book found = library.searchByTitle("Test3");
		
		assertNull(found);
	}

}
