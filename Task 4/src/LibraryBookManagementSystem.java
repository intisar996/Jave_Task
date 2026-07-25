import java.util.ArrayList;
import java.util.Scanner;

public class LibraryBookManagementSystem {

    public static void main(String[] args) {

        // 1. Create Book Lists
        ArrayList<String> bookTitles = new ArrayList<>();
        ArrayList<String> authors = new ArrayList<>();
        ArrayList<Boolean> availability = new ArrayList<>();

        bookTitles.add("Java Programming"); authors.add("James"); availability.add(true);
        bookTitles.add("Database Systems"); authors.add("John"); availability.add(true);
        bookTitles.add("Algorithms"); authors.add("Cormen"); availability.add(false);
        bookTitles.add("Operating Systems"); authors.add("Silberschatz"); availability.add(true);
        bookTitles.add("Computer Networks"); authors.add("Tanenbaum"); availability.add(true);
        bookTitles.add("Artificial Intelligence"); authors.add("Russell"); availability.add(false);
        bookTitles.add("Data Science"); authors.add("Smith"); availability.add(true);
        bookTitles.add("Machine Learning"); authors.add("Andrew"); availability.add(true);
        bookTitles.add("Cyber Security"); authors.add("Kevin"); availability.add(false);
        bookTitles.add("Software Engineering"); authors.add("Pressman"); availability.add(true);

        // 2. Display Library Books
        for (int i = 0; i < bookTitles.size(); i++) {
            System.out.println("Book " + i + ":");
            System.out.println("Title: " + bookTitles.get(i));
            System.out.println("Author: " + authors.get(i));
            System.out.println("Available: " + (availability.get(i) ? "Yes" : "No"));
        }

        Scanner input = new Scanner(System.in);

        // 3. Add New Book
        System.out.println("Enter Book Title:");
        String newTitle = input.nextLine();
        System.out.println("Enter Author:");
        String newAuthor = input.nextLine();
        System.out.println("Available (true/false):");
        boolean newAvailability = input.nextBoolean();

        bookTitles.add(newTitle);
        authors.add(newAuthor);
        availability.add(newAvailability);

        System.out.println("Book added successfully.");
        System.out.println("Updated Library:");
        for (int i = 0; i < bookTitles.size(); i++) {
            System.out.println("Book " + i + ": " + bookTitles.get(i) + " | " + authors.get(i) + " | " + (availability.get(i) ? "Available" : "Borrowed"));
        }

        // 4. Update Book Information
        System.out.println("Enter Book Index to update:");
        int updateIndex = input.nextInt();
        input.nextLine(); // consume newline

        if (updateIndex >= 0 && updateIndex < bookTitles.size()) {
            System.out.println("New Title:");
            String upTitle = input.nextLine();
            bookTitles.set(updateIndex, upTitle);

            System.out.println("New Author:");
            String upAuthor = input.nextLine();
            authors.set(updateIndex, upAuthor);

            System.out.println("Available (true/false):");
            boolean upAvailability = input.nextBoolean();
            availability.set(updateIndex, upAvailability);

            System.out.println("Book updated successfully.");
            System.out.println("UPDATED Book index: " + updateIndex);
            System.out.println("Title: " + bookTitles.get(updateIndex));
            System.out.println("Author: " + authors.get(updateIndex));
            System.out.println("Available: " + (availability.get(updateIndex) ? "Yes" : "No"));
        } else {
            System.out.println("Book Not Found");
        }

        // 5. Search Book System
        input.nextLine(); // consume newline
        System.out.println("Enter Book Title to search:");
        String searchTitle = input.nextLine();
        boolean found = false;

        for (int i = 0; i < bookTitles.size(); i++) {
            if (bookTitles.get(i).equalsIgnoreCase(searchTitle)) {
                System.out.println("Book Found!");
                System.out.println("Index: " + i);
                System.out.println("Author: " + authors.get(i));
                System.out.println("Available: " + (availability.get(i) ? "Yes" : "No"));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }

        input.close();
    }
}
