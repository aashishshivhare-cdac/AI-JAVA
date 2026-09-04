package Library_Overdue_Tracker;

import java.time.LocalDate;

// Main Application
public class TestLibraryOverdueTracker {
    public static void main(String[] args) {
        Library library = new Library();

        try {
            library.borrowBook(new Book(1, "Java Basics", LocalDate.of(2026, 9, 1)));
            library.borrowBook(new Book(2, "Data Structures", LocalDate.of(2026, 9, 10)));
            library.borrowBook(new Book(3, "Algorithms", LocalDate.of(2026, 8, 25)));
            // Uncomment to test duplicate
            // library.borrowBook(new Book(1, "Duplicate Java Basics", LocalDate.of(2026, 9, 5)));
        } catch (DuplicateBookException e) {
            System.out.println("❌ " + e.getMessage());
        }

        System.out.println("\n📚 All Borrowed Books:");
        library.displayBooks();

        System.out.println("\n📅 Books Sorted by Due Date:");
        library.getBooksSortedByDueDate().forEach(System.out::println);

        System.out.println("\n⚠️ Overdue Books:");
        library.getOverdueBooks(LocalDate.of(2026, 9, 4)).forEach(System.out::println);
    }
}
