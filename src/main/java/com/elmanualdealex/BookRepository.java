package com.elmanualdealex;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    // CREATE
    public static void addBook(Book book) {

        String sql = "INSERT INTO books (id, title, author) VALUES (?, ?, ?)";

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, book.id);
            stmt.setString(2, book.title);
            stmt.setString(3, book.author);
            stmt.executeUpdate();

            System.out.println("Book added successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public static List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM books";

        try (Connection conn = DB.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                books.add(new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    // DELETE
    public static void deleteBook(int id) {

        String sql = "DELETE FROM books WHERE id = ?";

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

            System.out.println("Book deleted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE (después)
    public static void updateBook(Book book) {

        String sql = "UPDATE books SET title = ?, author = ? WHERE id = ?";

        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, book.title);
            stmt.setString(2, book.author);
            stmt.setInt(3, book.id);

            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Book updated successfully");
            } else {
                System.out.println("Book not found with id: " + book.id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}