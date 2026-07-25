import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeSalaryManagementSystem {

    public static void main(String[] args) {

        // 1. Create Employee Lists
        ArrayList<String> employeeNames = new ArrayList<>();
        ArrayList<Integer> employeeIds = new ArrayList<>();
        ArrayList<Double> employeeSalaries = new ArrayList<>();

        employeeIds.add(1001); employeeNames.add("Ali"); employeeSalaries.add(850.0);
        employeeIds.add(1002); employeeNames.add("Sara"); employeeSalaries.add(1200.0);
        employeeIds.add(1003); employeeNames.add("Ahmed"); employeeSalaries.add(950.0);
        employeeIds.add(1004); employeeNames.add("Noor"); employeeSalaries.add(500.0);
        employeeIds.add(1005); employeeNames.add("Omar"); employeeSalaries.add(400.0);
        employeeIds.add(1006); employeeNames.add("Huda"); employeeSalaries.add(1100.0);
        employeeIds.add(1007); employeeNames.add("Salim"); employeeSalaries.add(700.0);
        employeeIds.add(1008); employeeNames.add("Fatima"); employeeSalaries.add(1300.0);
        employeeIds.add(1009); employeeNames.add("Khalid"); employeeSalaries.add(600.0);
        employeeIds.add(1010); employeeNames.add("Mona"); employeeSalaries.add(1000.0);

        // 2. Display Employee Information
        for (int i = 0; i < employeeNames.size(); i++) {
            System.out.println("Employee " + i + ":");
            System.out.println("ID: " + employeeIds.get(i));
            System.out.println("Name: " + employeeNames.get(i));
            System.out.println("Salary: " + employeeSalaries.get(i));
        }

        // 3. Salary Statistics
        double totalSalary = 0;
        double highestSalary = employeeSalaries.get(0);
        double lowestSalary = employeeSalaries.get(0);

        for (double salary : employeeSalaries) {
            totalSalary += salary;
            if (salary > highestSalary) highestSalary = salary;
            if (salary < lowestSalary) lowestSalary = salary;
        }

        double averageSalary = (double) totalSalary / employeeSalaries.size();

        System.out.println("Total Employees: " + employeeNames.size());
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Highest Salary: " + highestSalary);
        System.out.println("Lowest Salary: " + lowestSalary);

        // 4. Salary Category Analysis
        int high = 0, medium = 0, low = 0;
        for (double salary : employeeSalaries) {
            if (salary > 1000) high++;
            else if (salary >= 500) medium++;
            else low++;
        }
        System.out.println("High Salary Employees: " + high);
        System.out.println("Medium Salary Employees: " + medium);
        System.out.println("Low Salary Employees: " + low);

        Scanner input = new Scanner(System.in);

        // 5. Search Employee System
        System.out.println("Enter Employee ID to search:");
        int searchId = input.nextInt();
        boolean found = false;
        for (int i = 0; i < employeeIds.size(); i++) {
            if (employeeIds.get(i) == searchId) {
                System.out.println("Employee Found!");
                System.out.println("Name: " + employeeNames.get(i));
                System.out.println("Salary: " + employeeSalaries.get(i));
                System.out.println("Position: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }

        // 6. Update Employee Salary
        System.out.println("Enter Employee Index to update:");
        int updateIndex = input.nextInt();
        if (updateIndex >= 0 && updateIndex < employeeNames.size()) {
            System.out.println("Enter New Salary:");
            double newSalary = input.nextDouble();
            employeeSalaries.set(updateIndex, newSalary);
            System.out.println("Salary updated successfully.");
            System.out.println("UPDATED Employee index: " + updateIndex);
            System.out.println("Name: " + employeeNames.get(updateIndex));
            System.out.println("Salary: " + employeeSalaries.get(updateIndex));
        }

        // 7. Remove Employee
        System.out.println("Enter Employee Index to remove:");
        int removeIndex = input.nextInt();
        if (removeIndex >= 0 && removeIndex < employeeNames.size()) {
            employeeNames.remove(removeIndex);
            employeeIds.remove(removeIndex);
            employeeSalaries.remove(removeIndex);
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee Not Found");
        }

        // Display updated list
        System.out.println("Updated Employee List:");
        for (int i = 0; i < employeeNames.size(); i++) {
            System.out.println("Index: " + i + " | ID: " + employeeIds.get(i) +
                    " | Name: " + employeeNames.get(i) +
                    " | Salary: " + employeeSalaries.get(i));
        }

        // 8. Sorting Employees
        ArrayList<Double> sortedSalariesAsc = new ArrayList<>(employeeSalaries);
        Collections.sort(sortedSalariesAsc);
        System.out.println("Employees Sorted by Salary (Lowest to Highest): " + sortedSalariesAsc);

        ArrayList<Double> sortedSalariesDesc = new ArrayList<>(employeeSalaries);
        sortedSalariesDesc.sort(Collections.reverseOrder());
        System.out.println("Employees Sorted by Salary (Highest to Lowest): " + sortedSalariesDesc);

        // 9. Employee Salary Bonus Calculation
        System.out.println("Salary Bonus Report:");
        for (int i = 0; i < employeeNames.size(); i++) {
            double salary = employeeSalaries.get(i);
            double bonus;
            if (salary >= 1000) bonus = salary * 0.10;
            else if (salary >= 500) bonus = salary * 0.05;
            else bonus = salary * 0.02;

            double finalSalary = salary + bonus;
            System.out.println("Name: " + employeeNames.get(i) +
                    " | Current Salary: " + salary +
                    " | Bonus: " + bonus +
                    " | Final Salary: " + finalSalary);
        }

        input.close();
    }
}
