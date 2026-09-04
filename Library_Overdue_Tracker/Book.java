package Library_Overdue_Tracker;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

    // Book class
    class Book {
        private int id;
        private String title;
        private LocalDate dueDate;

        public Book(int id, String title, LocalDate dueDate) {
            this.id = id;
            this.title = title;
            this.dueDate = dueDate;
        }

        public int getId() { return id; }
        public String getTitle() { return title; }
        public LocalDate getDueDate() { return dueDate; }

        @Override
        public String toString() {
            return id + " - " + title + " (Due: " + dueDate + ")";
        }
    }
