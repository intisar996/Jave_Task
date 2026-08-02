import java.util.*;

public class StudentRegistrationManager {

    public static void main(String[] args) {

        Queue<String> waitingRegistration = new LinkedList<>();

        Deque<String> completedRegistration = new ArrayDeque<>();


        // open Scanner
        Scanner input = new Scanner(System.in);
        System.out.println(" number of students waiting for registration ");
        Integer numwatingR = input.nextInt();

        if(numwatingR <= 0) {
            System.out.println("Invalid number of students");
        }else {
            for(int i=0; i < numwatingR; i++) {
                System.out.println("enter student name");
                String name = input.next();
                waitingRegistration.offer(name);
            }
        }


        // use do - while loop

        int choice;

        do {


            //8. Display the following menu using a do-while loop:
            System.out.println("1-Add Student to Queue ");
            System.out.println("2-Process Student Registration ");
            System.out.println("3- View Next Student ");
            System.out.println("4-Undo Last Registration ");
            System.out.println("5-Search Student");
            System.out.println("6-Display Waiting Students");
            System.out.println("7-Display Registered Students ");
            System.out.println("8-Display Statistics");
            System.out.println("9-Exit");

            System.out.println("Enter Choice  :");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("enter student name");
                    String sname = input.next();
                    waitingRegistration.offer(sname);
                    System.out.println("Student added to registration queue successfully");
                    break;

                case 2 :
                    if(waitingRegistration.isEmpty()){
                        System.out.println("No students waiting for registration.");
                    }else {
                        String rem = waitingRegistration.remove();
                        completedRegistration.push(rem);
                        System.out.println("Student registration completed.");
                    }
                       break;
                case 3 :
                    if(waitingRegistration.isEmpty()) {
                        System.out.println("No students in the queue." );
                    }else {
                        System.out.println("Display the next student using element(). : " + waitingRegistration.element());
                    }
                    break;

                case 4 :
                    if(completedRegistration.isEmpty()) {
                        System.out.println("No registrations to undo." );
                    }else {

                        String remove = completedRegistration.pop();
                        System.out.println("removed student: " + remove);
                    }

                    break;
                case 5:
                    System.out.println("enter student name");
                    String snamee = input.next();
                    if (waitingRegistration.contains(snamee)) {
                        System.out.println("Waiting for registration ");
                    }else if(completedRegistration.contains(snamee)){
                        System.out.println("Already registered");
                    }else {
                        System.out.println("Not found ");
                    }
                    break;

                case 6 :
                    if(waitingRegistration.isEmpty()) {
                        System.out.println("No waiting students.");
                    }else{
                        for(String  sn : waitingRegistration) {
                            System.out.println("Display all students in the queue : " + sn);
                        }
                    }
                    break;

                case 7 :
                    if(completedRegistration.isEmpty()) {
                        System.out.println("No registered students.");
                    }else{
                        for(String  co : completedRegistration) {
                            System.out.println("Display all registered students in the stack : " + co);
                        }
                    }
                    break;

                case 8 :
                    System.out.println(" Total waiting students :" + waitingRegistration.size() );
                    System.out.println(" Total registered students :" + completedRegistration.size() );
                    System.out.println(" Next student waiting  :" + waitingRegistration.element() );
                    System.out.println(" Last registered student    :" + completedRegistration.peek());
                    System.out.println(" Check if queue is empty :" + waitingRegistration.isEmpty() );
                    System.out.println(" Check if stack is empty    :" + completedRegistration.isEmpty() );
            }

        }while(choice != 9);
    }
}
