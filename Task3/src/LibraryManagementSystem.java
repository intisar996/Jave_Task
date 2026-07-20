import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {


        // Create lists to store book information
        ArrayList<String> bookNames = new ArrayList<>();
        ArrayList<String> authorNames = new ArrayList<>();
        ArrayList<String> bookStatuses = new ArrayList<>();


        // Add new data
        bookNames.add("New Book One");
        authorNames.add("New Author One");
        bookStatuses.add("Available");

        bookNames.add("New Book Two");
        authorNames.add("New Author Two");
        bookStatuses.add("Not Available");

        bookNames.add("New Book Three");
        authorNames.add("New Author Three");
        bookStatuses.add("Available");

        bookNames.add("New Book Four");
        authorNames.add("New Author Four");
        bookStatuses.add("Not Available");

        bookNames.add("New Book Five");
        authorNames.add("New Author Five");
        bookStatuses.add("Available");

        bookNames.add("New Book Six");
        authorNames.add("New Author Six");
        bookStatuses.add("Available");

        bookNames.add("New Book Seven");
        authorNames.add("New Author Seven");
        bookStatuses.add("Not Available");

        bookNames.add("New Book Eight");
        authorNames.add("New Author Eight");
        bookStatuses.add("Available");

        bookNames.add("New Book Nine");
        authorNames.add("New Author Nine");
        bookStatuses.add("Not Available");

        bookNames.add("New Book Ten");
        authorNames.add("New Author Ten");
        bookStatuses.add("Available");

        Scanner input = new Scanner(System.in);
        int choice;
        // menu loop to select choice
        do {
            System.out.println("\n----- Library Menu -----");
            System.out.println("1: Display all books");
            System.out.println("2: Search for a book");
            System.out.println("3: Borrow a book");
            System.out.println("4: Return a book");
            System.out.println("5: Display library report");
            System.out.println("6: Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            // Switch case menu
            switch(choice) {
                case 1:
                    displayBooks(
                            bookNames,
                            authorNames,
                            bookStatuses
                    );
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Enter book name: ");
                    String searchName = input.nextLine();
                    searchBook(
                            searchName,
                            bookNames
                    );
                    break;
                case 3:
                    input.nextLine();

                    System.out.print("Enter book name to borrow: ");
                    String borrowName = input.nextLine();

                    borrowBook(
                            borrowName,
                            bookNames,
                            bookStatuses
                    );

                    break;
                case 4:

                    input.nextLine();

                    System.out.print("Enter book name to return: ");
                    String returnName = input.nextLine();


                    returnBook(
                            returnName,
                            bookNames,
                            bookStatuses
                    );
                    break;

                case 5:

                    displayReport(
                            bookNames,
                            bookStatuses
                    );

                    break;
                case 6:

                    System.out.println("Exit Program");

                    break;
                default:

                    System.out.println("Invalid choice");

            }


        } while(choice != 6);


    }

    // Method to display all output
    public static void displayBooks(
            ArrayList<String> bookNames,
            ArrayList<String> authors,
            ArrayList<String> statuses) {


        System.out.println("\n----- All Books -----");


        // Loop through books
        for(int i = 0; i < bookNames.size(); i++) {


            System.out.println("Book Name: " + bookNames.get(i));
            System.out.println("Author: " + authors.get(i));
            System.out.println("Status: " + statuses.get(i));

            System.out.println("----------------");
        }
    }

    // Method to search for a book
    public static void searchBook(
            String bookName,
            ArrayList<String> bookNames) {


        if(bookNames.contains(bookName)) {

            System.out.println("Book exists");

        } else {

            System.out.println("Book does not exist");
        }
    }



    // Method to borrow a book
    public static void borrowBook(
            String bookName,
            ArrayList<String> bookNames,
            ArrayList<String> statuses) {


        if(bookNames.contains(bookName)) {


            int index = bookNames.indexOf(bookName);


            if(statuses.get(index).equals("Available")) {


                statuses.set(index, "Not Available");

                System.out.println("Book borrowed successfully");


            } else {

                System.out.println("Book is not available");
            }


        } else {

            System.out.println("Book not found");
        }
    }


    // Method to return a book
    public static void returnBook(String bookName, ArrayList<String> bookNames, ArrayList<String> statuses) {
        if(bookNames.contains(bookName)) {
            int index = bookNames.indexOf(bookName);
            statuses.set(index, "Available");
            System.out.println("Book returned successfully");
        } else {

            System.out.println("Book not found");
        }
    }

    // Method to count available and unavailable books
    public static Integer[] countNumberBooks(
            ArrayList<String> statuses) {
        int available = 0;
        int unavailable = 0;
        // Loop and conditions
        for(int i = 0; i < statuses.size(); i++) {
            if(statuses.get(i).equals("Available")) {
                available++;
            } else {
                unavailable++;
            }
        }


        return new Integer[]{available, unavailable};
    }



    // Method to display library report
    public static void displayReport(
            ArrayList<String> bookNames,
            ArrayList<String> statuses) {


        Integer[] count = countNumberBooks(statuses);


        System.out.println("\n----- Library Report -----");

        System.out.println("Total Books: " + bookNames.size());

        System.out.println("Available Books: " + count[0]);

        System.out.println("Unavailable Books: " + count[1]);

    }

}