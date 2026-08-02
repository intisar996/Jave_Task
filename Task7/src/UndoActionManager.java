import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UndoActionManager {

    public static void main(String[] args) {
        Deque<String> actions = new ArrayDeque<>();
        //open Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("enter actions");
        Integer numOfactions = 0;

        // check input
        if (input.hasNextInt()) {
            numOfactions = input.nextInt();
        } else {
            System.out.println("Invalid input");
        }
        // check number of book
        if (numOfactions <= 0) {
            System.out.println("Invalid number of actions.");
        } else {
            // add new book
            for (int i = 0; i < numOfactions; i++) {
                System.out.println("enter actions");
                String name = input.next();
                actions.push(name);
            }
        }

        int choice;

        do {
            //8. Display the following menu using a do-while loop:
            System.out.println("1-Add Action");
            System.out.println("2-Undo Last Action ");
            System.out.println("3-View Last Action ");
            System.out.println("4-Search Action  ");
            System.out.println("5-Display All  Actions ");
            System.out.println("6-Display Stack Statistics");
            System.out.println("7-Clear All Actions");
            System.out.println("8-Exit");

            System.out.println("Enter Choice  :");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("enter action");
                    String action = input.next();
                    if(!action.isEmpty()) {
                        actions.push(action);
                        System.out.println("Action added successfully.");
                    }
                    break;
                case 2 :
                  if(actions.isEmpty()){
                      System.out.println("No actions to undo.");
                  }else {
                      String de = actions.pop();
                      System.out.println("removed action : " + de);
                  }
                    break;

                case 3 :
                    if(actions.isEmpty()) {
                        System.out.println("No actions available");
                    }else {
                        System.out.println(" last action :" +  actions.peek());
                    }
                    break;
                case 4 :
                    System.out.println("enter action");
                    String searchAction = input.next();
                    int pos = search(actions,searchAction);
                    if(pos != -1 ) {
                        System.out.println("action postion : " + pos);
                    }else {
                        System.out.println("Action not found");
                    }
                    break;

                case 5:

                    System.out.println("Display all actions :" + actions);
                    break;

                case 6:
                    System.out.println("Total number of actions : " + actions.size());
                    System.out.println("Most recent action   : " + actions.peek());
                    System.out.println("isEmpty : " + actions.isEmpty());
                    break;

                case 7 :
                    actions.clear();
                    System.out.println("All actions have been cleared");
                    break;

                case 8 :
                    System.out.println("Exit");
                    break;

            }

        }while (choice != 8);

        // use do-while


    }


    // method to search
    public static int search(Deque<String> actions, String action){
        int pos = 1;
        for(String a : actions){
            if (a.equals(action)) {

                return pos;
            }
            pos++;
        }
        return -1;
    }
}
