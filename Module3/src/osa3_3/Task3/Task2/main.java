package osa3_3.Task2;

import osa3_3.Task2.library.model.Book;
import osa3_3.Task2.library.model.LibraryMember;
import osa3_3.Task2.library.system.Library;

public class main {
    public static void main(String [] args) {
        Library library = new Library();



        //Borrow book
        Book book1 = new Book("1984", "George Orwell", "12344");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "56789");


        library.addBook(book1);
        library.addBook(book2);


        LibraryMember member = new LibraryMember("Ari" ,  1);
        library.addMember(member);

        System.out.println("---Testing the task 2---");

        library.borrowBook(member, book1);

        library.returnBook(member, book2);





    }
}
