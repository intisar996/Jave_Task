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
                        if (numOfcourse >= 6) {
                            System.out.println("not allowed to add more than 6 course");
                            numOfcourse = input.nextInt();
                        }else {
                            System.out.println("Enter course name");
                            String coursename= input.next();
                            setCourse.add(coursename);
                        }

                    }
                    students.put(id, setCourse);
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
                  System.out.println(" 6-Add New Student");
                  System.out.println(" 7-Search by course name");
                  System.out.println(" 8-Exit");
                  System.out.println("enter number");
                  String num = input.next();

                  switch (num) {
                      case "1" :
                          // search student
                          System.out.println("Enter Your ID");
                          Integer sid = input.nextInt();
                          if(students.containsKey(sid)) {
                              System.out.println("all registered courses " + students.get(sid));
                          }else {
                              System.out.println("Student not found");
                          }
                          break;

                      case "2" :
                          // add course to student
                          System.out.println("Enter Your ID");
                          Integer id = input.nextInt();
                          if(students.containsKey(id)) {
                              System.out.println("Enter course name");
                              String cname = input.next();
                              HashSet<String> setCourse = students.get(id);
                              if(setCourse.contains(cname)) {
                                  System.out.println("Course already registered");
                              }else {
                                  setCourse.add(cname);
                                  students.replace(id, setCourse);
                                  System.out.println("Course added successfully.");
                              }

                          }
                         break;

                      case "3" :
                          // remove course
                          System.out.println("Enter Your ID");
                          Integer rid = input.nextInt();
                          if(students.containsKey(rid)) {
                              System.out.println("Enter course name");
                              String cname = input.next();
                              HashSet<String> setCourse = students.get(rid);
                              if(setCourse.contains(cname)) {
                                  setCourse.remove(cname);
                                  System.out.println("Course removed successfully.");
                              }else {
                                  System.out.println("Course not found.");
                              }
                          }else {
                              System.out.println("Student not found.");
                          }
                            break;
                      case "4":
                         //Display All Students
                          for(Integer stid : students.keySet()) {
                              System.out.println("Student Id : " + stid);
                              System.out.println("Course : " + students.get(stid));
                          }
                          break;
                      case "5" :
                           // Display Registration Statistics
                          System.out.println("Total number of students : " + students.size());
                          int totalRegistrations  =0;
                          int mincourse =Integer.MAX_VALUE;
                          Integer maxcourse = -1;
                          Double average = 0.0;

                          for(HashSet<String> course : students.values()) {
                              totalRegistrations  += course.size();
                              }
                          if (students.size() > 0) {
                              average = (double) totalRegistrations / students.size();
                          }

                          for(Integer ssid : students.keySet()){
                              int courseCount = students.get(ssid).size();

                              if(courseCount > maxcourse) {
                                  maxcourse = ssid;
                              }

                              if(courseCount < mincourse) {
                                  mincourse = ssid;
                              }
                          }
                          if(!maxcourse.equals(-1) ){
                              System.out.println("Student with the highest number of registered course :" + maxcourse);
                              System.out.println("Student with the lowest  number of registered course :" + mincourse);
                          }
                          System.out.println("Total number of course registrations : " + totalRegistrations  );
                          System.out.println("Average : " + average  );
                          break;
                      case "6" :
                          System.out.println("enter new student id");
                          Integer newsid = input.nextInt();
                          if(students.containsKey(newsid)) {
                              System.out.println("This Ids already registered");
                          }else {
                              ids.add(newsid);
                              System.out.println("Enter number of courses");
                              Integer numOfcourse= input.nextInt();
                              HashSet<String> setCourse = new HashSet<>();
                              for(int j = 0; j <= numOfcourse - 1;j++) {
                                  if (numOfcourse >= 6) {
                                      System.out.println("not allowed to add more than 6 course");
                                      numOfcourse = input.nextInt();
                                  }else {
                                      System.out.println("Enter course name");
                                      String coursename= input.next();
                                      setCourse.add(coursename);
                                  }

                              }
                              students.put(newsid, setCourse);
                          }
                          break;

                      case "7" :
                          System.out.println("Enter course name");
                          String searchCourse = input.next();
                           for(Integer stuid : students.keySet()) {
                               HashSet<String> courses = students.get(stuid);

                               if (courses.contains(searchCourse)) {
                                   System.out.println("Student ID: " + stuid);

                               }
                           }
                          break;
                      case "8" :
                          exit = true;
                          break;
                  }


              }


        System.out.println("Display all students in ascending order of their IDs :" + students);

              input.close();

    }
}
