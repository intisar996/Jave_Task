import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDirectoryMap {

    public static void main(String[] args) {

        // open Scanner
        Scanner input = new Scanner(System.in);
        // create set
        Map<Integer,String> employees  = new HashMap<>();
        // ask user to enter number of employees
        System.out.println("Enter number of employees");
        Integer numOfemployees = input.nextInt();


        // loop
        for(int i = 0; i <= numOfemployees - 1; i++){
            // check number of numOfemployees
            if(numOfemployees <= 0){
                System.out.println("Invalid number of employees.");
            }else {
                System.out.println("enter employees ID");
                Integer id = input.nextInt();
                System.out.println("enter employees Name");
                String name = input.next();

                if(employees.containsKey(id)) {
                    System.out.println("Employee ID already exists. Please enter a unique ID.");
                }else {
                    employees.put(id,name);
                }
            }
        }
           //search employee
        System.out.println("Enter Employee ID To Search");
        Integer emId = input.nextInt();
            if(employees.containsKey(emId)) {
                System.out.println("Employee Found: " +  employees.get(emId));
            }else {
                System.out.println("Employee ID not found.");
            }



        // classify
        if(employees.size() > 10) {
            System.out.println("Large Company");
        }else if(employees.size() > 5) {
            System.out.println(" Medium Company");
        }else {
            System.out.println(" Small Company");
        }


        // print output
        System.out.println("Total Employee" + numOfemployees);
        System.out.println("Total unique Employee" + employees.size());
        System.out.println("Employee" + employees);
        System.out.println("Employee" + employees);

        input.close();

    }
}
