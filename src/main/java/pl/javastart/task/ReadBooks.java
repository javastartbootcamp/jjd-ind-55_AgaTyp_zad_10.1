package pl.javastart.task;

import java.util.Scanner;

public class ReadBooks {
    
    private Scanner sc = new Scanner(System.in);
    private Library library = new Library();

    private void close() {
        sc.close();
    }

    private void readBook() {
        String name;
        int pages;
        System.out.println("Podaj tytuł");
        name = sc.nextLine();
        System.out.println("Podaj liczbę stron");
        pages = sc.nextInt();
        sc.nextLine();
        library.addBook(new Book(name, pages));

    }

    public void addToLibrary() {
        System.out.println("Podaj unikalne książki");

        do {
            readBook();

        } while (library.outOfSpace());
        close();

    }
}
