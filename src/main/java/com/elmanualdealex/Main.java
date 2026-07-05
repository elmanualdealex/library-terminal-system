package com.elmanualdealex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n1. Add book");
            System.out.println("2. Watch books");
            System.out.println("3. Quit");

            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                System.out.print("ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Title: ");
                String title = input.nextLine();

                System.out.print("Author: ");
                String author = input.nextLine();

                library.addBook(new Book(id, title, author));
            } else if (option == 2) {
                library.showBooks();
            } else {
                break;
            }
        }
    }
}