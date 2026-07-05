package com.elmanualdealex;

public class Book {
    String title;
    String author;
    int id;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return id + "," + title + "," + author;
    }
}
