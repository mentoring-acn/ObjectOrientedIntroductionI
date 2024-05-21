Congratulations on your journey to mastering Object-Oriented Programming (OOP) concepts! In this exercise, we will apply the knowledge you've acquired by working on a practical example. We'll be dealing with a Book class and a Library class, incorporating key OOP concepts such as classes, objects, constructors, and encapsulation. 

Your task is to complete the provided Java code, and run the test cases in the project. All of them must pass for this exercise to be considered COMPLETED. The exercise involves completing the Book class, defining its structure with private fields, and ensuring it follows the principles of encapsulation. Next, you'll modify the Library class, which manages a collection of books, allowing for the addition of new books, displaying the entire library, etc. 

This hands-on exercise is designed to reinforce your understanding of OOP concepts in Java. Take this opportunity to apply what you've learned about classes, access modifiers, methods, etc. Good luck! 
 
To complete this lab, you might find the following resources helpful: 

Object-Oriented Programming Concepts (Oracle): https://docs.oracle.com/javase/tutorial/java/concepts/

What is Object Orientation? (Pluralsight): https://app.pluralsight.com/ilx/video-courses/86714d19-8b08-404a-b24e-7fcff53fa426/af09bc2c-9029-42e9-8192-c12ebf543666/048dcc2a-2560-41a0-9884-8c96f5de009b

Working with Classes and Interfaces in Java 11 (Pluralsight): https://app.pluralsight.com/library/courses/working-classes-interfaces-java/table-of-contents

Prerequisites:
1. Download and install JDK 17 (at a minimum) from this link: https://www.oracle.com/java/technologies/downloads/
2. Download and install Spring Tool Suite for Eclipse from this link: https://spring.io/tools
3. Download and install Git from this link: https://git-scm.com/downloads

Completing this lab:
1. Clone this Git repository locally
2. Open the repository in Spring Tool Suite by going to File/Open Projects From File System
3. Navigate to the com.example.demo.model package. You'll see the Book and Library classes. Model them based on the information below:


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

4. Go to the com.example.demo package in the test packages, open the ObjectOrientedIntroductionIApplicationTests class, and then go to Run/Run As/JUnit Test.
For this lab to be considered complete, please provide a screenshot off ALL the test cases passing to the person that assigned this lab to you.