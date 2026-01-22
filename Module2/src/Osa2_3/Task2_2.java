//Module 2.3 Task 1//

package Osa2_3;

//Creating class Book//

import java.util.ArrayList;

class Book2 {
    private String title;
    private String author;
    private int year;


    //adding the constructor//
    public Book2(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    //adding getters//
    public String getTitle() {
        return title;

    }


    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;

    }
}

//adding new class Library//
class Library2 {
    private ArrayList<Book2> books = new ArrayList<>();

    public void addBook(Book2 book) {
        books.add(book);
    }

    public void borrowBook(String title) {
        books.removeIf(book2 -> book2.getTitle().equalsIgnoreCase(title));
    }

    public void returnBook(Book2 book) {
        books.add(book);
    }


    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book2 b = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + b.getTitle() + "\", Author: " + b.getAuthor() + ", Year: " + b.getYear());
        }
    }



    //Lets  add method to search and display the details and of books written by  specific author//
    public void FindBooksByAuthor(String author) {
        System.out.println("Books by " + author + "\":");

        for (Book2 b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {

                System.out.println("Title: \"" + b.getTitle() + "\", Year: " + b.getYear());
            }
        }
    }
}





public class Task2_2 {
    //Main method//
    public static void main(String[] args) {
        Library2 myLibrary2 = new Library2();

        Book2 exampleBook = new Book2("Java Basics", "John Doe", 2021);

        System.out.println("Testing book class:");
        System.out.println("Title: " + exampleBook.getTitle());
        System.out.println("Author: " + exampleBook.getAuthor());
        System.out.println("Year: " + exampleBook.getYear());


    }
}


