import java.util.*;

public class CustomerQueueManager {

    public static void main(String[] args) {
        Queue<String> customers = new LinkedList<>();
        //open Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of customers");
        Integer numOfcustomers = 0;

        // check input
        if (input.hasNextInt()) {
            numOfcustomers = input.nextInt();
        } else {
            System.out.println("Invalid input");
        }
        // check number of book
        if (numOfcustomers <= 0) {
            System.out.println("Invalid number of customers.");
        } else {
            // add new book
            for (int i = 0; i < numOfcustomers; i++) {
                System.out.println("enter customers");
                String name = input.next();
                customers.offer(name);
            }
        }


        int choice;

        do {
            //8. Display the following menu using a do-while loop:
            System.out.println("1-Add Customer");
            System.out.println("2-Serve Customer ");
            System.out.println("3-View Next Customer ");
            System.out.println("4-Search Customer");
            System.out.println("5-Display All Customers  ");
            System.out.println("6-Display Queue Statistics  ");
            System.out.println("7-Exit");

            System.out.println("Enter Choice  :");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:

                    System.out.println("enter customer name");
                    String cname = input.next();
                    customers.offer(cname);
                    break;

                case 2 :
                    if(customers.isEmpty()){
                        System.out.println("No customers in the queue.");
                    }else {
                        String remove = customers.poll();
                        System.out.println("removed customer : " + remove);
                    }
                    break;
                case 3 :
                    if(customers.isEmpty()){
                        System.out.println("No customers in the queue.");
                    }else {
                        String peek = customers.peek();
                        System.out.println("first customer : " + peek);
                    }
                    break;
                case 4 :

                    System.out.println("enter customer name");
                    String sname = input.next();
                    if (customers.contains(sname)) {
                        System.out.println("customer is found");
                    }else {
                        System.out.println("customer is not found");
                    }
                    break;

                case 5 :
                    if(customers.isEmpty()){
                        System.out.println("No customers in the queue.");
                    }else {
                       for(String cnamee : customers){
                           System.out.println("all customer :" + cnamee);
                       }
                    }
                    break;
                case 6 :

                    System.out.println("Total number of customers :  " + customers.size()) ;
                    System.out.println("First customer in the queue   :  " + customers.peek()) ;
//                    System.out.println("Last customer in the queue   :  " + customers.peekLast()) ;
                    System.out.println("isEmpty :  " + customers.isEmpty()) ;
                    break;


                case 7 :
                    System.out.println("Exit");
                    break;
            }

        }while (choice != 7);












    }


}
