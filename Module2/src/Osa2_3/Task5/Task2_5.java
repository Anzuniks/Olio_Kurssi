//Module 2.3 Task 1//

package Osa2_3.Task5;

//Creating class Book//

import java.util.ArrayList;

class Book5 {
    private String title;
    private String author;
    private int year;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();


    //adding the constructor//
    public Book5(String title, String author, int year) {
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
class Library5 {
    private ArrayList<Book5> books = new ArrayList<>();

    public void addBook(Book5 book) {
        books.add(book);
    }

    public void borrowBook(String title) {
        books.removeIf(book2 -> book2.getTitle().equalsIgnoreCase(title));
    }

    public void returnBook(Book5 book) {
        books.add(book);
    }

    public double getAverageBookRating() {
        if (books.isEmpty()) return 0.0;

        double totalRating = 0;
        for (Book5 b : books) {
            totalRating += b.getRating();
        }
        return totalRating / books.size();
    }

    public Book5 getMostReviewedBook() {
        if (books.isEmpty()) return null;


        Book5 mostReviewedBook = books.get(0);
        for (Book5 b : books) {
           if (b.getReviewCount() > mostReviewedBook.getReviewCount()) {
               mostReviewedBook = b;
           }
        }
        return mostReviewedBook;
    }

    public boolean isBookAvailable(String title) {
        //lets return the boolean//
        for (Book5 b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }


    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book5 b = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + b.getTitle() + "\", Author: " + b.getAuthor() + ", Year: " + b.getYear());
        }
    }



    //Lets  add method to search and display the details and of books written by  specific author//
    public void FindBooksByAuthor(String author) {
        System.out.println("Books by " + author + "\":");

        for (Book5 b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {

                System.out.println("Title: \"" + b.getTitle() + "\", Year: " + b.getYear());
            }
        }
    }
}





public class Task2_5 {
    //Main method//
    public static void main(String[] args) {
        Library5 myLibrary = new Library5();

        System.out.println("\n--- Library Statistics ---");
        System.out.printf("Average Book Rating: %.2f%n", myLibrary.getAverageBookRating());

        Book5 popular = myLibrary.getMostReviewedBook();
        if (popular != null) {
            System.out.println("Most Reviewed Book: " + popular.getTitle() +
                    " with " + popular.getReviewCount() + " reviews.");
        }
    }
}


