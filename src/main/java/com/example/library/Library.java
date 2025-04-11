package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book + " added to the library.");
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println(book + " removed from the library.");
        } else {
            System.out.println(book + " not found in the library.");
        }
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            books.forEach(System.out::println);
        }
    }
}
