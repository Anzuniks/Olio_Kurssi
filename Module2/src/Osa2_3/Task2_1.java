//Module 2.3 Task 1//

package Osa2_3;

//Creating class Book//

import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private int year;


    //adding the constructor//
    public Book(String title, String author, int year) {
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
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }


    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + b.getTitle() + "\", Author: " + b.getAuthor() + ", Year: " + b.getYear());
        }
    }

    //Lets  add method to search and display the details and of books written by  specific author//
    public void FindBooksByAuthor(String author) {
        System.out.println("Books by " + author + "\":");

        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {

                System.out.println("Title: \"" + b.getTitle() + "\", Year: " + b.getYear());
            }
        }
    }
}





public class Task2_1 {
    //Main method//
    public static void main(String[] args) {
        Library myLibrary = new Library();


        myLibrary.addBook(new Book("Introduction to java Programing", "John Smith", 2020));
        myLibrary.addBook(new Book("Data Structures and Algorithms", "Jane Doe", 2018));
        myLibrary.addBook(new Book("The Art of Fiction", "Alice Johnson", 2019));

        //displaying the list//
        myLibrary.displayBooks();

        //Searchin specifi author and displaying the result//
        myLibrary.FindBooksByAuthor("Jane Doe");

        myLibrary.FindBooksByAuthor("Alice Johnson");

    }
}


