package Library_Overdue_Tracker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Library class
class Library {
    private List<Book> borrowedBooks = new ArrayList<>();

    // Add book with duplicate check
    public void borrowBook(Book book) throws DuplicateBookException {
        // Normal way
        for (Book b : borrowedBooks) {
            if (b.getId() == book.getId()) {
                throw new DuplicateBookException("Duplicate entry: " + book.getTitle());
            }
        }

        // Stream way (same logic)
        boolean exists = borrowedBooks.stream()
                .anyMatch(b -> b.getId() == book.getId());
        if (exists) {
            throw new DuplicateBookException("Duplicate entry (Stream): " + book.getTitle());
        }

        borrowedBooks.add(book);
    }

    // Sort books by due date
    public List<Book> getBooksSortedByDueDate() {
        // Normal way
        List<Book> sorted = new ArrayList<>(borrowedBooks);
        sorted.sort(Comparator.comparing(Book::getDueDate));

        // Stream way
        List<Book> sortedStream = borrowedBooks.stream()
                .sorted(Comparator.comparing(Book::getDueDate))
                .collect(Collectors.toList());

        return sortedStream; // returning stream version
    }

    // Find overdue books
    public List<Book> getOverdueBooks(LocalDate today) {
        // Normal way
        List<Book> overdue = new ArrayList<>();
        for (Book b : borrowedBooks) {
            if (b.getDueDate().isBefore(today)) {
                overdue.add(b);
            }
        }

        // Stream way
        List<Book> overdueStream = borrowedBooks.stream()
                .filter(b -> b.getDueDate().isBefore(today))
                .collect(Collectors.toList());

        return overdueStream; // returning stream version
    }

    // Display all borrowed books
    public void displayBooks() {
        borrowedBooks.forEach(System.out::println);
    }
}
