package osa3_3.Task2.library.system;

import osa3_3.Task2.library.model.Book;
import osa3_3.Task2.library.model.LibraryMember;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (books.contains(book)) {
            member.borrowBook(book);
            System.out.println(member.getName() + " Borrowed " + book.getTitle());
        } else {
            System.out.println("Book not found in library.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        member.returnBook(book);
        System.out.println(member.getName() + " Returned " + book.getTitle());
    }
}


