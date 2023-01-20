package pl.javastart.task;

import java.util.Scanner;

public class ReadBooks {

    private Scanner sc = new Scanner(System.in);
    private Library library = new Library();

    private void close() {
        sc.close();
    }

    private Book createBook() {
        String name;
        int pages;
        System.out.println("Podaj tytuł");
        name = sc.nextLine();
        System.out.println("Podaj liczbę stron");
        pages = sc.nextInt();
        sc.nextLine();
        return new Book(name, pages);
    }

    public void fillBooks() {
        System.out.println("Podaj unikalne książki");

        do {
            Book book = createBook();
            library.addBook(book);

        } while (library.hasSpace());
        close();

    }

    public void printLibrary() {
        System.out.println("Książki w biblioteczce:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}
