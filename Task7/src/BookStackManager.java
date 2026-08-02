import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BookStackManager {

    public static void main(String[] args){
        Deque<String> book = new ArrayDeque<>();
        //open Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of book");
        Integer numOfBook = 0;

        // check input
        if(input.hasNextInt()) {
             numOfBook = input.nextInt();
        }else {
            System.out.println("Invalid input");
        }
          // check number of book
        if(numOfBook <= 0 ){
            System.out.println("Invalid number of books.");
        }else {
            // add new book
            for (int i = 0; i < numOfBook; i++) {
                System.out.println("enter book title");
                String name = input.next();
                book.push(name);
            }
        }

        // use do-while

        int choice;

        do{
            //8. Display the following menu using a do-while loop:
            System.out.println("1-Add Book");
            System.out.println("2-Remove Top Book");
            System.out.println("3-View Top Book");
            System.out.println("4-Search Book ");
            System.out.println("5-Display All Books ");
            System.out.println("6-Display Stack Statistics");
            System.out.println("7-Exit");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                // add book
                case 1:
                    System.out.println("add book title");
                    String title = input.next();
                    book.push(title);
                    System.out.println("Book added successfully." );
                    break;
                case 2 :
                     if(book.isEmpty()) {
                         System.out.println("No books available");
                     }else {

                         String deleted = book.pop();
                         System.out.println("removed book :" + deleted);
                     }
                    break;

                case 3 :
                    if(book.isEmpty()) {
                        System.out.println("No books available");
                    }else {
                        System.out.println("Display the top book using the peek() method " + book.peek());
                    }
                    break;

                case 4:
                    input.nextLine();
                    System.out.println("enter book title");
                    String searchTitle = input.next();
                    int pos = search(book,searchTitle);

                    if(pos !=0) {
                        System.out.println("position from the top :" + pos);
                    }else {
                        System.out.println("Book not found");
                    }
                    break;



                case  5 :
                    System.out.println("Display Books :" + book);

                    break;

                case 6:
                    System.out.println("Total number of Book : " + book.size());
                    System.out.println("Top book  : " + book.peekFirst());
                    System.out.println("Whether the stack is empty   : " + book.isEmpty());

                    break;
                case 7:
                    System.out.println("Exit");
                    break;
            }
        }while(choice != 7);










    }
    public static int search(Deque<String> book, String title){
        int pos = 1;
        for(String b : book) {
            if(b.equals(title)) {
                return  pos;
            }
            pos++;
        }
        return -1;
    }


}


