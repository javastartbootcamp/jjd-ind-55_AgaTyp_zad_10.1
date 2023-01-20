package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ReadBooks readBooks = new ReadBooks();
        readBooks.addToLibrary();
        readBooks.printLibrary();
    }
}
