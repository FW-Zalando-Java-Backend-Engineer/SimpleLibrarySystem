package com.example.library;

public class Book {
    private String title;
    private String author;
    private String category;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() { return  category; }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + "\" of Category " + category;
    }
}
