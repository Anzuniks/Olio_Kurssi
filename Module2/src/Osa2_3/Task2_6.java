//Module 2.3 Task 1//

package Osa2_3;

//Creating class Book//

import java.util.ArrayList;

class Book6 {
    private String title;
    private String author;
    private int year;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();


    //adding the constructor//
    public Book6(String title, String author, int year) {
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

//Adding new class of user//
    class User6 {
    private String name;
    private int age;
    private ArrayList<Book6> borrowedBooks = new ArrayList<>();

    public User6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addBorrowedBook(Book6 book) {
        borrowedBooks.add(book);
    }

    public String getName() {
        return name;
    }

}



//adding new class Library//
class Library6 {
    private ArrayList<Book6> books = new ArrayList<>();
    private ArrayList<User6> users = new ArrayList<>();


    public void addUser(User6 user) {
        users.add(user);
    }

    public void addBook(Book6 book) {
        books.add(book);
    }

    public void borrowBook(String title) {
        books.removeIf(book2 -> book2.getTitle().equalsIgnoreCase(title));
    }

    public void returnBook(Book6 book) {
        books.add(book);
    }


    public double getAverageBookRating() {
        if (books.isEmpty()) return 0.0;

        double totalRating = 0;
        for (Book6 b : books) {
            totalRating += b.getRating();
        }
        return totalRating / books.size();
    }

    public Book6 getMostReviewedBook() {
        if (books.isEmpty()) return null;


        Book6 mostReviewedBook = books.get(0);
        for (Book6 b : books) {
            if (b.getReviewCount() > mostReviewedBook.getReviewCount()) {
                mostReviewedBook = b;
            }
        }
        return mostReviewedBook;
    }

    public boolean isBookAvailable(String title) {
        //lets return the boolean//
        for (Book6 b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }


    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book6 b = books.get(i);
            System.out.println((i + 1) + ". Title: \"" + b.getTitle() + "\", Author: " + b.getAuthor() + ", Year: " + b.getYear());
        }
    }



    //Lets  add method to search and display the details and of books written by  specific author//
    public void FindBooksByAuthor(String author) {
        System.out.println("Books by " + author + "\":");

        for (Book6 b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {

                System.out.println("Title: \"" + b.getTitle() + "\", Year: " + b.getYear());
            }
        }
    }
}





public class Task2_6 {
    //Main method//
    public static void main(String[] args) {
        Library6 myLibrary = new Library6();

        Book6 javaBook = new Book6("Introduction to java programming", "John Doe", 2020);
        myLibrary.addBook(javaBook);
        myLibrary.addBook(new Book6("Data Structures and Algorithms", "Jane Doe", 2018));
        myLibrary.addBook(new Book6("The Art of Fiction","Alice Johnson", 2019));

        myLibrary.displayBooks();

        User6 matti = new User6("Matti Meikäläinen", 30);
        myLibrary.addUser(matti);

        System.out.println("\n" + matti.getName() + " borrows a book: " + javaBook.getTitle());

        myLibrary.borrowBook("Introduction to java programming");

        matti.addBorrowedBook(javaBook);

        System.out.println("\n---- Situation after borrowing --/");
        myLibrary.displayBooks();

        System.out.println("User: " + matti.getName() + " Has successfully borrowed the book");

        javaBook.setRating(4.8);
        javaBook.addReview("Excellent");
        System.out.println("\nAverage rating of books in library: " + myLibrary.getAverageBookRating());


    }
}


