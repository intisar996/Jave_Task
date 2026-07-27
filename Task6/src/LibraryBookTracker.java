import java.util.*;

public class LibraryBookTracker {
    public static void main(String[] args) {
        // open Scanner
        Scanner input = new Scanner(System.in);
        // create set
        Set<Integer> ids = new HashSet<>();
        Map<Integer, String> books = new HashMap<>();
        // ask user to enter number of books
        System.out.println("Enter number of books");
        Integer numOfbooks= input.nextInt();


        // loop
        for(int i = 0; i <= numOfbooks - 1; i++){
            // check number of numOfemployees
            if(numOfbooks <= 0){
                System.out.println("Invalid number of product.");
            }else {
                System.out.println("enter BOOK id");
                Integer id = input.nextInt();
                input.nextLine();
                System.out.println("enter BOOK title");
                String title = input.nextLine();

                if(books.containsKey(id)) {
                    System.out.println("Duplicate Book ID. Record not added.");
                }else {
                    books.put(id,title);
                    ids.add(id);
                }
            }
        }

        System.out.println("enter book id to search");
        Integer sid = input.nextInt();
        // search book
        if(books.containsKey(sid)){
            System.out.println("The book ID  :" + sid);
            System.out.println("The book title  :" + books.get(sid));
        }else {
            System.out.println("Book not found.");
        }

        // classify
        if(books.size()  > 10) {
            System.out.println("Large Library");
        }else if(books.size() > 5) {
            System.out.println("Medium Library");
        }else {
            System.out.println("Small Library");
        }

        // print output
        System.out.println("Total unique book :  " + numOfbooks);
        System.out.println("Total book records :  " + books.size());
        System.out.println("All book id and title :" + books);

    }

}
