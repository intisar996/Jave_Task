import java.util.*;

public class HospitalPatientManager {

    public static void main(String[] args) {

        Queue<String> waitingPatient = new LinkedList<>();

        Deque<String> patienttreatments = new ArrayDeque<>();


        // open Scanner
        Scanner input = new Scanner(System.in);
        System.out.println(" number of patients waiting  ");
        Integer numpatientsWating = input.nextInt();

        if(numpatientsWating <= 0) {
            System.out.println("Invalid number of patients");
        }else {
            for(int i=0; i < numpatientsWating; i++) {
                System.out.println("enter patients name");
                String name = input.next();
                waitingPatient.offer(name);
            }
        }


        // use do - while loop

        int choice;

        do {


            //8. Display the following menu using a do-while loop:
            System.out.println("1-Add Patient");
            System.out.println("2-Treat Patient ");
            System.out.println("3- View Next Patient ");
            System.out.println("4-Undo Last Treatment ");
            System.out.println("5-Search Patient");
            System.out.println("6-Display Waiting Patient");
            System.out.println("7-Display Treated Patient ");
            System.out.println("8-Display Hospital Statistics ");
            System.out.println("9-Exit");

            System.out.println("Enter Choice  :");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("enter patient name");
                    String sname = input.next();
                    waitingPatient.offer(sname);
                    System.out.println("Patient added successfully.");
                    break;

                case 2 :
                    if(waitingPatient.isEmpty()){
                        System.out.println("No patients waiting for treatment");
                    }else {
                        String rem = waitingPatient.poll();
                        patienttreatments.push(rem);
                        System.out.println("Patient treatment completed successfully");
                    }
                    break;
                case 3 :
                    if(waitingPatient.isEmpty()) {
                        System.out.println("No patients available" );
                    }else {
                        System.out.println("Display the next patient using peek(): " + waitingPatient.peek());
                    }
                    break;

                case 4 :
                    if(patienttreatments.isEmpty()) {
                        System.out.println("No completed treatments available." );
                    }else {

                        String remove = patienttreatments.pop();
                        System.out.println("removed patient: " + remove);
                    }

                    break;
                case 5:
                    System.out.println("enter patient name");
                    String pname = input.next();
                    if (waitingPatient.contains(pname)) {
                        System.out.println("Patient is waiting for treatment");
                    }else if(patienttreatments.contains(pname)){
                        System.out.println("Patient treatment completed.");
                    }else {
                        System.out.println("Patient Not found ");
                    }
                    break;

                case 6 :
                    if(waitingPatient.isEmpty()) {
                        System.out.println("No waiting patients.");
                    }else{
                        for(String  sn : waitingPatient) {
                            System.out.println("Display all patients in the queue : " + sn);
                        }
                    }
                    break;

                case 7 :
                    if(patienttreatments.isEmpty()) {
                        System.out.println("No treated patients.");
                    }else{
                        for(String  co : patienttreatments) {
                            System.out.println("Display all registered completed treatments in the stack : " + co);
                        }
                    }
                    break;

                case 8 :
                    System.out.println(" Total waiting patients :" + waitingPatient.size() );
                    System.out.println(" Total  treated patients   :" + patienttreatments.size() );
                    System.out.println(" Next patient waiting  :" + waitingPatient.element() );
                    System.out.println(" Last treated patient      :" + patienttreatments.peek());
                    System.out.println(" Check if queue is empty :" + waitingPatient.isEmpty() );
                    System.out.println(" Check if stack is empty    :" + patienttreatments.isEmpty() );
            }

        }while(choice != 9);
    }
}
