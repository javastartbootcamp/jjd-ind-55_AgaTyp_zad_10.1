package pl.javastart.task;

public class Library {
    private static final int LIBRARY_SIZE = 3;
    private Book[] books = new Book[LIBRARY_SIZE];
    private int bookNo = 0;

    void addBook(Book book) {
        if (bookNo < LIBRARY_SIZE) {
            if (!bookExists(book)) {
                books[bookNo] = book;
                bookNo++;
            }
        }
    }

    boolean hasSpace() {
        return (bookNo < LIBRARY_SIZE);
    }

    private boolean bookExists(Book book) {
        boolean exists = false;
        for (int i = 0; i < bookNo; i++) {
            exists = book.equals(books[i]);
            if (exists) {
                System.out.println("Książka już stoi na półce.");
                break;
            }
        }
        return exists;
    }

    public Book[] getBooks() {
        return books;
    }
}
