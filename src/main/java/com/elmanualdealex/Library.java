package com.elmanualdealex;

import java.util.ArrayList;
public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b.id + " – " + b.title + " – " + b.author);
        }
    }
}
