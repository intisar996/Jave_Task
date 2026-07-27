import java.util.*;

public class UniversityCourseRegistrationSystem {

    public static void main(String[] args) {
        // open Scanner
        Scanner input = new Scanner(System.in);
        // create set
        Set<Integer> ids = new HashSet<>();
        Map<Integer, HashSet<String>> students = new HashMap<>();


        // ask user to enter number of students
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
                if(students.containsKey(id)) {
                    System.out.println("Student ID already exists. Record not added.");
                }else {
                    ids.add(id);
                    System.out.println("Enter number of courses");
                    Integer numOfcourse= input.nextInt();
                    HashSet<String> setCourse = new HashSet<>();
                    for(int j = 0; j <= numOfcourse - 1;j++) {
                        System.out.println("Enter course name");
                        String coursename= input.next();
                        setCourse.add(coursename);
                        students.put(id, setCourse);
                    }
                    }
                 }
            }


              boolean exit = false;
              while (!exit){
                  System.out.println(" 1-Search Student");
                  System.out.println(" 2-Add Course to Student");
                  System.out.println(" 3-Remove Course from Student ");
                  System.out.println(" 4-Display All Students ");
                  System.out.println(" 5-Display Registration Statistics");
                  System.out.println(" 6-Exit");
                  System.out.println("enter number");
                  String num = input.next();

                  switch (num) {
                      case "1" :
                          System.out.println("Enter Your ID");
                          Integer sid = input.nextInt();
                          if(students.containsKey(sid)) {
                              System.out.println("all registered courses " + students.get(1));
                          }else {
                              System.out.println("Student not found");
                          }
                          break;

                      case "2" :


                  }


              }








        System.out.println("Student List" + students);
        input.close();

    }
}
