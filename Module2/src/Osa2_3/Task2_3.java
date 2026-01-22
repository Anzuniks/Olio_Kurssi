package Osa2_3;

import java.util.ArrayList;

// Luokan nimi on Book3
class Book3 {
    private String title;
    private String author;
    private int year;

    public Book3(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
}

// Luokan nimi on Library3
class Library3 {
    // TÄRKEÄÄ: Listan tyypin on oltava Book3, jotta se täsmää yläpuolella olevaan luokkaan
    private ArrayList<Book3> books = new ArrayList<>();

    public void addBook(Book3 book) {
        books.add(book);
    }

    public void borrowBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public void returnBook(Book3 book) {
        books.add(book);
    }

    public boolean isBookAvailable(String title) {
        for (Book3 b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book3 b = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + b.getTitle() + "\", Author: " + b.getAuthor() + ", Year: " + b.getYear());
        }
    }

    public void FindBooksByAuthor(String author) {
        System.out.println("\nBooks by " + author + ":");
        for (Book3 b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: \"" + b.getTitle() + "\", Year: " + b.getYear());
            }
        }
    }
}

public class Task2_3 {
    public static void main(String[] args) {
        Library3 myLibrary = new Library3();


        myLibrary.addBook(new Book3("Introduction to java Programing", "John Smith", 2020));
        myLibrary.addBook(new Book3("Data Structures and Algorithms", "Jane Doe", 2018));
        myLibrary.addBook(new Book3("The Art of Fiction", "Alice Johnson", 2019));


        myLibrary.displayBooks();


        System.out.println("\nIs 'The Art of Fiction' available? " + myLibrary.isBookAvailable("The Art of Fiction"));


        myLibrary.FindBooksByAuthor("Jane Doe");
    }
}