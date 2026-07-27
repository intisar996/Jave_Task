import java.util.*;

public class CourseEnrollmentSystem {
    public static void main(String[] args) {
        // open Scanner
        Scanner input = new Scanner(System.in);
        // create set
        Set<Integer> ids = new HashSet<>();
        Map<Integer, String> students = new HashMap<>();
        // ask user to enter number of books
        System.out.println("Enter number of students");
        Integer numOfstudents= input.nextInt();


        // loop
        for(int i = 0; i <= numOfstudents - 1; i++){
            // check number of numOfstudents
            if(numOfstudents <= 0){
                System.out.println("Invalid number of students.");
            }else {
                System.out.println("enter students id");
                Integer id = input.nextInt();
                input.nextLine();
                System.out.println("enter course name");
                String course = input.nextLine();

                if(students.containsKey(id)) {
                    System.out.println("Student ID already exists. Record not added.");
                }else {
                    students.put(id,course);
                    ids.add(id);
                }
            }
        }

        System.out.println("enter student id to update");
        Integer sid = input.nextInt();
        input.nextLine();
        // search book
        if(students.containsKey(sid)){
            System.out.println("enter the new course name.");
            String cname = input.nextLine();
            students.replace(sid,cname);
            System.out.println("Course updated successfully");
        }else {
            System.out.println("Student ID  not found.");
        }

        // classify
        if(students.size()  > 15) {
            System.out.println("Large Enrollment");
        }else if(students.size() > 5) {
            System.out.println("Medium Enrollment");
        }else {
            System.out.println("Small Enrollment ");
        }

        // print output
        System.out.println("Total unique student :  " + ids.size());
        System.out.println("Total student records :  " + students.size());
        System.out.println("All student IDs with their enrolled courses  :" + students);
        System.out.println("All student IDs  :" + ids);

        input.close();

    }
}
