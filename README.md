Congratulations on your journey to mastering Object-Oriented Programming (OOP) concepts! In this exercise, we will apply the knowledge you've acquired by working on a practical example. We'll be dealing with a Book class and a Library class, incorporating key OOP concepts such as classes, objects, constructors, and encapsulation. 

Your task is to complete the provided Java code, and run the test cases in the project. All of them must pass for this exercise to be considered COMPLETED. The exercise involves completing the Book class, defining its structure with private fields, and ensuring it follows the principles of encapsulation. Next, you'll modify the Library class, which manages a collection of books, allowing for the addition of new books, displaying the entire library, etc. 

This hands-on exercise is designed to reinforce your understanding of OOP concepts in Java. Take this opportunity to apply what you've learned about classes, access modifiers, methods, etc. Good luck! 
 

Here's an overview of the classes involved: 

Book class 
Properties: 
* title (String): Title of the book. 
* author (String): Author of the book. 
* isbn (String): ISBN of the book.
  
Methods: 
* Book(String title, String author, String isbn) – Constructor. 
* Getters and Setters. 

Library class 
Properties: 
* books (List<Book>): List of books representing the library. 

Methods 
* Library(): - Constructor 
* addBook(Book): void - Adds a book to the list. 
* removeBook(Book): void - Removes a book from the list. 
* containsBook(Book): boolean – Returns true or false whether the book is in the list or not. 
* searchByTitle(String): Book – Checks if a book is in the list by its title, returns it if found, else returns null. 
* toString(): String – String representation of the library. 
* Getter and Setter. 
