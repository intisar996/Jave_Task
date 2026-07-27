import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeSalaryManager {


    public static void main(String[] args) {
        // open Scanner
        Scanner input = new Scanner(System.in);
        // create map
        Map<Integer,Double> employee = new HashMap<>();

        // ask user to input number of employee
        System.out.println("Enter number of employee");
        Integer numOfemp = input.nextInt();

        for(int i = 0; i <= numOfemp - 1; i++){
            // check number of employee
            if(numOfemp <= 0){
                System.out.println("Invalid number of employees.");
            }else {
                System.out.println("enter employee  id");
                Integer eid = input.nextInt();

                if(employee.containsKey(eid)) {
                    System.out.println("Employee ID already exists. Record not added.");
                }else {
                    System.out.println("enter employee salary ");
                    Double salary  = input.nextDouble();
                    // add employee to mapm
                    employee.put(eid,salary);
                }
            }
        }


      int choice;

        do {
            System.out.println("1-Add Employee");
            System.out.println("2-Search Employee");
            System.out.println("3-Update Salary");
            System.out.println("4-Remove Employee");
            System.out.println("5-Display All Employees");
            System.out.println("6-Display Salary Statistics");
            System.out.println("7-Exit");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Add Employee
                    System.out.println("enter new Employee Id");
                    Integer empid = input.nextInt();

                    System.out.println("enter new Employee Salary");
                    Double empsalary = input.nextDouble();
                    // check if employee is register or not
                    if (employee.containsKey(empid)) {
                        System.out.println("Employee Already registered");

                    } else {
                        employee.put(empid, empsalary);
                    }
                    break;
                case 2:
                    // Search Employee
                    System.out.println("enter new Employee Id");
                    Integer emlpid = input.nextInt();
                    if (employee.containsKey(emlpid)) {
                        System.out.println("Employee Salary :" + employee.get(emlpid));
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 3:
                    //update Salary
                    System.out.println("enter new Employee Id");
                    Integer eid = input.nextInt();
                    if (employee.containsKey(eid)) {
                        System.out.println("enter new salary");
                        Double newSalary = input.nextDouble();
                        employee.replace(eid, newSalary);
                    } else {
                        System.out.println("employee not found");
                    }
                    break;

                case 4:
                    // remove employee
                    System.out.println("enter new Employee Id");
                    Integer emid = input.nextInt();
                    if (employee.containsKey(emid)) {
                        employee.remove(emid);
                    } else {
                        System.out.println("employee not found");
                    }

                    break;

                case 5:
                    System.out.println("Display all employee IDs and salaries : " + employee);
                    break;
                case 6:
                    Double Highestsalary = 0.0;
                    Double Lowestsalary = Double.MAX_VALUE;
                    Double totalPayroll = 0.0;

                    Integer hid = 0;
                    Integer lid = 0;

                    for (Integer id : employee.keySet()) {
                        Double salary = employee.get(id);
                        totalPayroll += salary;

                        if (salary > Highestsalary) {
                            Highestsalary = salary;
                            hid = id;
                        }

                        if (salary < Highestsalary) {
                            Lowestsalary = salary;
                            lid = id;
                        }
                    }
                    double averageSalary = totalPayroll / employee.size();

                    System.out.println("Highest salary: " + Highestsalary);
                    System.out.println("Employee ID: " + hid);

                    System.out.println("Lowest salary: " + Lowestsalary);
                    System.out.println("Employee ID: " + lid);

                    System.out.println("Average salary: " + averageSalary);

                    System.out.println("Total payroll: " + totalPayroll);


                    break;

                case 7:
                    System.out.println("Exit");
                    break;
            }
        }
        while(choice != 7);




        input.nextLine();

    }


}
