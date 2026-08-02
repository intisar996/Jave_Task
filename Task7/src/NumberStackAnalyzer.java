import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class NumberStackAnalyzer {

    public static void main(String[] args) {
        Deque<Integer> values = new ArrayDeque<>();
        //open Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of values");
        Integer numOfactions = 0;

        // check input
        if (input.hasNextInt()) {
            numOfactions = input.nextInt();
        } else {
            System.out.println("Invalid input");
        }
        // check number of book
        if (numOfactions <= 0) {
            System.out.println("Invalid number of values.");
        } else {
            // add new book
            for (int i = 0; i < numOfactions; i++) {
                System.out.println("enter values");
                Integer value = input.nextInt();
                values.push(value);
            }
        }


        input.nextLine();
        int choice;

        do {
            //8. Display the following menu using a do-while loop:
            System.out.println("1-Add Number");
            System.out.println("2-Remove Top Number");
            System.out.println("3-View Top Number");
            System.out.println("4-Display All Numbers ");
            System.out.println("5-Analyze Numbers ");
            System.out.println("6-Exit");

            System.out.println("Enter Choice  :");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("enter number");
                    Integer number = 0;
                    if(input.hasNextInt()){
                        number =input.nextInt();
                        values.push(number);
                        System.out.println("Number added successfully.");
                    }else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 2 :
                    if(values.isEmpty()){
                        System.out.println("stack is empty");
                    }else {
                        Integer de = values.pop();
                        System.out.println("removed number " + de);
                    }
                    break;

                case 3 :
                    if(values.isEmpty()){
                        System.out.println("stack is empty");
                    }else {
                        System.out.println("Display the top number" + values.peek());
                    }
                    break;
                case 4:
                    if(values.isEmpty()){
                        System.out.println("stack is empty");
                    }else {
                      for(Integer v : values){
                          System.out.println("display every number :" + v );
                      }
                    }
                    break;

                case 5:
                    int sum = 0;
                    int Average = 0;
                    int Largest = values.getFirst();
                    int Smallest = values.getFirst();
                    int even = 0;
                    int odd = 0;
                    int positive = 0;
                    int negative = 0;
                    int zeros = 0;

                        System.out.println(" Total number of element: " + values.size());
                       for(Integer v : values){
                           sum += v;
                           Average = sum / values.size();

                           if(v > Largest ) {
                               Largest = v;
                           }

                           if(v < Smallest ) {
                               Smallest = v;
                           }
                           // even or odd number
                           if(v % 2 == 0){
                               even += v;
                           }else {
                               odd += v;
                           }
                           // positive  and negative number
                           if(v > 0) {
                               positive++;
                           }else if(v.equals(0)) {
                               zeros++;
                           }else {
                               negative++;
                           }



                    }
                    System.out.println("Sum : " + sum );
                    System.out.println("Largest : " + Largest );
                    System.out.println("Smallest : " + Smallest );
                    System.out.println("even : " + even );
                    System.out.println("odd : " + odd );
                    System.out.println("positive : " + positive );
                    System.out.println("negative : " + negative );
                    System.out.println("zeros : " + zeros );
                    System.out.println("Average : " + Average );

                    break;

            }

        }while (choice != 6);










    }

    }
