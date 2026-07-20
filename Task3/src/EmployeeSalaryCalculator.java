public class EmployeeSalaryCalculator {

    // Attributes
    String employeeName = "Said";
    int basicSalary = 500;
    int bonus = 50;
    int deduction = 40;
    int netSalary;

    public static void main(String[] args) {

        EmployeeSalaryCalculator employeeSalaryCalculator =
                new EmployeeSalaryCalculator();

        employeeSalaryCalculator.netSalary =
                employeeSalaryCalculator.calculateNetSalary(
                        employeeSalaryCalculator.basicSalary,
                        employeeSalaryCalculator.bonus,
                        employeeSalaryCalculator.deduction);

        String salaryStatus =
                employeeSalaryCalculator.checkSalaryStatus(
                        employeeSalaryCalculator.netSalary);

        employeeSalaryCalculator.displaySalaryDetails(
                employeeSalaryCalculator.employeeName,
                employeeSalaryCalculator.basicSalary,
                employeeSalaryCalculator.bonus,
                employeeSalaryCalculator.deduction,
                employeeSalaryCalculator.netSalary,
                salaryStatus);
    }

    // Calculate net salary
    public int calculateNetSalary(int basicSalary, int bonus, int deduction) {
        return basicSalary + bonus - deduction;
    }

    // Check salary status
    public String checkSalaryStatus(int netSalary) {

        if (netSalary < 500) {
            return "Low Salary";
        } else if (netSalary <= 1500) {
            return "Medium Salary";
        } else {
            return "High Salary";
        }
    }

    // Display salary details
    public void displaySalaryDetails(String employeeName,
                                     int  basicSalary,
                                     int bonus,
                                     int deduction,
                                     int netSalary,
                                     String salarystatus){

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Deduction: " + deduction);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Salary Status: " + salarystatus);
    }
}