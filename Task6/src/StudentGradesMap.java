import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradesMap {

    public static void main(String[] args) {

        // open Scanner
        Scanner input = new Scanner(System.in);
        // create set
        Map<Integer,Double> student  = new HashMap<>();
        // ask user to enter number of employees
        System.out.println("Enter number of student");
        Integer numOfstudent = input.nextInt();


        // loop
        for(int i = 0; i <= numOfstudent - 1; i++){
            // check number of numOfemployees
            if(numOfstudent <= 0){
                System.out.println("Invalid number of student.");
            }else {
                System.out.println("enter student ID");
                Integer id = input.nextInt();
                System.out.println("enter student grade");
                Double grade = input.nextDouble();

                if(student.containsKey(id)) {
                    System.out.println("Student ID already exists. Please enter a unique ID.");
                }else {
                    student.put(id,grade);
                }
            }
        }
        //search employee
        System.out.println("Enter  student ID  To updated  grade");
        Integer sId = input.nextInt();


        if(student.containsKey(sId)) {
            System.out.println("Enter new grade");
            Double newgrade = input.nextDouble();
            student.replace(sId,newgrade);
            System.out.println("Grade updated successfully");
        }else {
            System.out.println("Student ID not found.");
        }



          Double sum = 0.0;
         for(Map.Entry<Integer,Double> entry : student.entrySet()){
             sum += entry.getValue();
         }
          Double Average = sum / student.size();

        // classify
        if(Average  > 85) {
            System.out.println("Excellent Performance");
        }else if(Average > 60) {
            System.out.println("Good Performance");
        }else {
            System.out.println("Needs Improvement");
        }


        // print output
        System.out.println("Total student records  " + student.size());
        System.out.println("All student IDs and grades  " + student);
      System.out.println("Average :" + Average);

    }
}
