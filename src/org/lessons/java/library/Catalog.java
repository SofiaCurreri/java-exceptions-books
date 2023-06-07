package org.lessons.java.library;
import java.util.Scanner;
public class Catalog {
    public static void main(String[] args) {
        Scanner book = new Scanner(System.in);

        System.out.println("Quanti libri ci sono nel catalogo?");
        int n = book.nextInt();
        book.nextLine();

        Book[] catalog = new Book[n];;

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci il titolo del libro");
            String title = book.nextLine();

            System.out.println("Inserisci il numero di pagine del libro");
            int numPages = book.nextInt();
            book.nextLine();

            System.out.println("Inserisci l' autore del libro");
            String author = book.nextLine();

            System.out.println("Inserisci la casa editrice del libro");
            String editor = book.nextLine();

            try {
                catalog[i] = new Book(title, numPages, author, editor);
            } catch (IllegalArgumentException e) {
                System.out.println("Errore: " + e.getMessage());
                i--;
            }
        }

        for (Book bookEl : catalog) {
            System.out.print(bookEl + "\n\n");
        }

    }
}
