//Module 2.3 Task 1//

package Osa2_3;

//Creating class Book//

import java.util.ArrayList;

class Book4 {
    private String title;
    private String author;
    private int year;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();


    //adding the constructor//
    public Book4(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }


    public double getRating() {
        return rating;
    }

    public int getReviewCount() {
        return reviews.size();
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
class Library4 {
    private ArrayList<Book4> books = new ArrayList<>();

    public void addBook(Book4 book) {
        books.add(book);
    }

    public void borrowBook(String title) {
        books.removeIf(book2 -> book2.getTitle().equalsIgnoreCase(title));
    }

    public void returnBook(Book4 book) {
        books.add(book);
    }

    public boolean isBookAvailable(String title) {
        //lets return the boolean//
        for (Book4 b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }


    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book4 b = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + b.getTitle() + "\", Author: " + b.getAuthor() + ", Year: " + b.getYear());
        }
    }



    //Lets  add method to search and display the details and of books written by  specific author//
    public void FindBooksByAuthor(String author) {
        System.out.println("Books by " + author + "\":");

        for (Book4 b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {

                System.out.println("Title: \"" + b.getTitle() + "\", Year: " + b.getYear());
            }
        }
    }
}





public class Task2_4 {
    //Main method//
    public static void main(String[] args) {
        Library4 myLibrary = new Library4();


        Book4 book1 = new Book4("Introduction to java Programing", "John Smith", 2020);
        Book4 book2 = new Book4("Data Structures and Algorithms", "Jane Doe", 2018);
        Book4 book3 = new Book4("The Art of Fiction", "Alice Johnson", 2019);

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

        System.out.println("---\n Testing Rating and Reviews \n---");

        book1.setRating(4.5);
        book1.addReview("Great book for beginners!");
        book1.addReview("Well explained concepts.");

        book2.setRating(4.0);
        book2.addReview("Essential for computer science students.");

        System.out.println("Book:" + book1.getTitle());
        System.out.println("Rating: " + book1.getRating());
        System.out.println("Reviews" + book1.getReviewCount());

        System.out.println("\nBook:" + book2.getTitle());
        System.out.println("Rating: " + book2.getRating());
        System.out.println("Reviews" + book2.getReviewCount());


        System.out.println("--\n Library Catalog and Searches ---");
        myLibrary.displayBooks();
        myLibrary.FindBooksByAuthor("Jane Doe");



    }
}


