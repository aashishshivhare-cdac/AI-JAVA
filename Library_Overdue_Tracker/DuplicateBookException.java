package Library_Overdue_Tracker;

// Custom Exception
class DuplicateBookException extends Exception {
    public DuplicateBookException(String msg) { super(msg); }
}
