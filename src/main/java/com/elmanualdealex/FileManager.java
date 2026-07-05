package com.elmanualdealex;
import java.io.*;
import java.util.*;

public class FileManager {
    private static final String FILE_NAME = "books.txt";

    // CREATE (save a book)
    public static void saveBook(Book book) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(book.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving book!");
        }
    }

    // READ (read book list)
    public static List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                Book book = new Book(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        parts[2]
                );

                books.add(book);
            }

        } catch (IOException e) {
            System.out.println("No books or error reading file!");
        }
        return books;
    }

    // DELETE (overwrite a file without a book)
    public static void deleteBook(int id) {
        List<Book> books = getAllBooks();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))){
            for (Book b : books) {
                if (b.id != id) {
                    bw.write(b.toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error removing book!");
        }
    }
}
