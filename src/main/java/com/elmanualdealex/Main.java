package com.elmanualdealex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n 📚 LIBRARY SYSTEM");
            System.out.println("1. Add book");
            System.out.println("2. Show books");
            System.out.println("3. Delete book");
            System.out.println("4. Modify book");
            System.out.println("5. Exit");

            String inputText = input.nextLine();
            int option;

            try {
                option = Integer.parseInt(inputText);
            } catch (NumberFormatException e) {
                System.out.println("Invalid option!");
                continue;
            }

            if (option == 1) {
                System.out.print("ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Title: ");
                String title = input.nextLine();

                System.out.print("Author: ");
                String author = input.nextLine();

                BookRepository.addBook(new Book(id, title, author));
            } else if (option == 2) {
                for (Book b : BookRepository.getBooks()) {
                    System.out.println(b.id + " – " + b.title + " – " + b.author);
                }
            } else if (option == 3) {
                System.out.print("ID to delete: ");
                int id = input.nextInt();
                BookRepository.deleteBook(id);

            } else if (option == 4) {
                System.out.print("ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("New title: ");
                String title = input.nextLine();

                System.out.print("New author: ");
                String author = input.nextLine();

                BookRepository.updateBook(new Book(id, title, author));
            } else if (option == 5) {
                break;
            } else {
                try {
                    option = Integer.parseInt(inputText);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid option!");
                    continue;
                }
            }
        }
    }
}