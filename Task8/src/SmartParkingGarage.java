import java.util.*;

public  class SmartParkingGarage {
    static  int  choice;
    // open Scanner
    static Scanner input = new Scanner(System.in);
    static String platinum = "";
    static Queue<String> waitingVehicles = new LinkedList<>();
    static Deque<String> parkedVehicles = new ArrayDeque<>();
    static Integer capacity = 3;
    static Integer totalParkedCounter = 0;
    static Integer totalWaitingCounter = 0;
    static Integer departedcounter = 0;


    public static  void main(String[] args){

        // check capacity


        if(parkedVehicles.size() < capacity) {
            System.out.println("enter license plate number");
            platinum = input.next();
            // add car to parking
            if(parkedVehicles.contains(platinum) || waitingVehicles.contains(platinum)){
                System.out.println("vehicle already exists");
            }else {
                parkedVehicles.push(platinum);
            }
        }else{
            // add to waiting list
            waitingVehicles.offer(platinum);
        }

        // ========= Smart Parking Garage =========



        do {


            displayMenu();

            input.nextLine();

            switch (choice) {
                case 1 :
                    //1. Add Vehicle to Waiting Queue
                    platinum = "";
                    System.out.println("enter license plate number");
                    platinum = input.nextLine();
                    if(platinum.isEmpty()){
                        System.out.println("enter license plate number");
                        platinum = input.nextLine();
                    }
                    addVehicle(platinum);
                    break;

                case 2 :
                    //Option 2 – Park Next Vehicle
                    parkVehicle();
                    break;

                case 3 :
                    //Option 3 – Remove Parked Vehicle
                    removeVehicle();

                    break;

                case 4 :
                    //View Next Waiting Vehicle
                    displayWaitingQueue();
                    break;
                case 5:
                    //View Last Parked Vehicle
                    displayParkedVehicles();
                    break;
                case 6:
                    // Display Waiting Queue
                    if(waitingVehicles.isEmpty()){
                        System.out.println("No vehicles are waiting");
                    }else {
                        System.out.println("Waiting vehicle numbers :" + waitingVehicles.size());
                        System.out.println(" Total waiting vehicles:" + totalWaitingCounter);
                    }

                    break;

                case 7 :

                    int spaces = capacity - parkedVehicles.size();
                    System.out.println("Vehicles from newest parked to oldest" + parkedVehicles);
                    System.out.println("Occupied Spaces" + capacity);
                    System.out.println("Vehicles from newest parked to oldest" + parkedVehicles.size());
                    System.out.println("Available Spaces" + spaces);
                    break;

                case 8:
                    String search = "";
                    System.out.println("enter license plate number");
                    search = input.nextLine();
                    if(search.isEmpty()){
                        System.out.println("enter license plate number");
                        search = input.nextLine();
                    }

                    searchVehicle(search);
                    break;
                case 9:
                    displayStatistics();
                    break;

                case 10 :
                    System.out.print("Are you sure you want to clear the waiting queue? (YES/NO): ");
                    String answer = input.nextLine();
                    clearWaitingQueue(answer);
                    break;
                case 11 :
                    System.out.print("Are you sure you want to clear the parking stack? (YES/NO): ");
                    String answerp = input.nextLine();
                    clearParkingGarage(answerp);
                    break;
                case 12 :
                    resetSystem();
                    break;
                case 13 :
                    System.out.println("Thank you for using Smart Parking Garage.");
                    input.close();
                    System.exit(0);
                    break;
            }


        }while(choice != 13);



    }


    // methods
    public static int displayMenu() {
        System.out.println("1-Add Vehicle to Waiting Queue");
        System.out.println("2. Park Next Vehicle");
        System.out.println("3. Remove Parked Vehicle");
        System.out.println("4. View Next Waiting Vehicle");
        System.out.println("5. View Last Parked Vehicle");
        System.out.println("6. Display Waiting Queue");
        System.out.println("7. Display Parked Vehicles");
        System.out.println("8. Search Vehicle");
        System.out.println("9. Display Garage Statistics");
        System.out.println("10. Clear Waiting Queue");
        System.out.println("11. Clear Parking Garage");
        System.out.println("12. Reset Entire System");
        System.out.println("13. Exit");

        System.out.println("Enter choice :");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            input.next();
            System.out.println("Enter choice :");

        }
        choice = input.nextInt();
        return choice;
    }


    //addVehicle()
    public static  void addVehicle(String platinum){


        if (waitingVehicles.contains(platinum) || parkedVehicles.contains(platinum)) {
            System.out.println("already exist");
        }else {
            waitingVehicles.offer(platinum);
            totalWaitingCounter++;
            System.out.println("Successfully added to waiting list ");
            System.out.println("the parked vehicle : " + parkedVehicles);
            System.out.println("the waitingVehicles vehicle : " + waitingVehicles);

        }
    }

    //parkVehicle()


    public static void  parkVehicle() {
        if(waitingVehicles.isEmpty()){
            System.out.println("no car in waiting list");
        }
        if(parkedVehicles.size() < capacity) {
            String removeFirstVehicle = waitingVehicles.poll();
            parkedVehicles.push(removeFirstVehicle);
            totalParkedCounter++;
            System.out.println("the parked vehicle : " + parkedVehicles);
            System.out.println("the waitingVehicles vehicle : " + waitingVehicles);
        }else {
            System.out.println("garage is already full.");
        }
    }

    //removeVehicle()
    public static void  removeVehicle() {
        if(!parkedVehicles.isEmpty()){
            String removedVehicle =   parkedVehicles.pop();
            departedcounter++;
            // next waiting
            String next = waitingVehicles.poll();
            // add car to parking
            parkedVehicles.push(next);
            System.out.println("parkedVehicles " + parkedVehicles);
            System.out.println("waitingVehicles " + waitingVehicles);

        }

    }

    public static void  displayNextWaiting() {
        System.out.println("next vehicle waiting : " + waitingVehicles.peek());

    }
    public static void  displayLastParked() {
        System.out.println("parked vehicle" +  parkedVehicles.peekLast());

    }


    public static void displayStatistics(){
        System.out.println("Garage Statistics");
        System.out.println("Maximum Capacity : " + capacity);
        System.out.println("Current Parked Vehicles : " + parkedVehicles.size());
        System.out.println("Waiting Vehicles : " + waitingVehicles.size());
        System.out.println("Available Spaces : " + (capacity - parkedVehicles.size()));
        System.out.println("Total Vehicles Parked Today : " + totalParkedCounter);
        System.out.println("Total Vehicles Departed Today : " + departedcounter);
        System.out.println("Total Vehicles Processed : " + (totalParkedCounter + departedcounter));
    }


    public static void clearWaitingQueue(String answer){


        if (answer.equalsIgnoreCase("YES")) {
            waitingVehicles.clear();
            System.out.println("Waiting queue cleared successfully.");
        } else {
            System.out.println("Operation cancelled.");
        }
    }

    public static void clearParkingGarage(String answer){


        if (answer.equalsIgnoreCase("YES")) {
            parkedVehicles.clear();
            System.out.println("Waiting queue cleared successfully.");
        } else {
            System.out.println("Operation cancelled.");
        }
    }


    public static  void resetSystem() {
        waitingVehicles.clear();
        parkedVehicles.clear();

        totalParkedCounter = 0;
        departedcounter = 0;
        System.out.println("System successfully reset.");


    }
    public static void searchVehicle(String search) {
        if(waitingVehicles.contains(search)){
            System.out.println("Waiting in queue :");
        }else if(parkedVehicles.contains(search)) {
            System.out.println("Parked");
        }else {
            System.out.println("Not found");
        }
    }


    public static void displayWaitingQueue(){
        if (waitingVehicles.isEmpty()) {
            System.out.println("No waiting vehicles.");
        } else {
            System.out.println("Next waiting vehicle: " + waitingVehicles.peek());
        }
    }
    public static void displayParkedVehicles(){
        if (parkedVehicles.isEmpty()) {
            System.out.println("No parked vehicles.");
        } else {
            System.out.println("Last parked vehicle: " + parkedVehicles.peekLast());
        }
    }




}
