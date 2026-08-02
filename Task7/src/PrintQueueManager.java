import java.util.*;

public class PrintQueueManager {

    public static void main(String[] args) {
        Queue<String> jobs = new LinkedList<>();
        //open Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of jobs");
        Integer numOfjobs = 0;

        // check input
        if (input.hasNextInt()) {
            numOfjobs = input.nextInt();
        } else {
            System.out.println("Invalid input");
        }
        // check number of jobs
        if (numOfjobs <= 0) {
            System.out.println("Invalid number of jobs.");
        } else {
            // add new jobs
            for (int i = 0; i < numOfjobs; i++) {
                System.out.println("enter jobs");
                String name = input.next();
                jobs.offer(name);
            }
        }


        int choice;

        do {
            //8. Display the following menu using a do-while loop:
            System.out.println("1-Add  Print Job");
            System.out.println("2-Process Next Print Job  ");
            System.out.println("3-View Next Print Job  ");
            System.out.println("4-Search Print Job");
            System.out.println("5-Remove Print Job ");
            System.out.println("6-Display All Print Jobs  ");
            System.out.println("7-Display Queue Statistics   ");
            System.out.println("8-Exit");

            System.out.println("Enter Choice  :");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:

                    System.out.println("enter  print job");
                    String pjob = input.next();
                    jobs.offer(pjob);
                    System.out.println("Print job added successfully.");
                    break;

                case 2 :
                    if(jobs.isEmpty()){
                        System.out.println("No print jobs in the queue");
                    }else {
                        String remove = jobs.poll();
                        System.out.println("removed print jobs  : " + remove);
                    }
                    break;
                case 3 :
                    if(jobs.isEmpty()){
                        System.out.println("No print jobs in the queue");
                    }else {
                        String peek = jobs.peek();
                        System.out.println("next  print job : " + peek);
                    }
                    break;
                case 4 :

                    System.out.println("enter  print job name");
                    String job = input.next();
                    if (jobs.contains(job)) {
                        System.out.println("print job name is found");
                    }else {
                        System.out.println("print job name is not found");
                    }
                    break;

                case 5 :
                    System.out.println("enter  print job name");
                    String rem = input.next();
                    if(jobs.contains(rem)) {
                        jobs.remove(rem);
                    }else {
                        System.out.println("Print job not found.");
                    }
                    break;
                case 6 :

                     if(jobs.isEmpty()) {
                         System.out.println("No print jobs in the queue."  );
                     }else {
                         for(String j : jobs) {
                             System.out.println("Display all print jobs :" + j);
                         }
                     }
                    break;


                case 7 :
                    System.out.println("Total number of print jobs   : " + jobs.size());
                    System.out.println("Next print job   : " + jobs.peek());
                    System.out.println("isEmpty  : " + jobs.isEmpty());
                    break;

                case 8 :
                    System.out.println("Exit");
                    break;
            }

        }while (choice != 7);












    }


}
