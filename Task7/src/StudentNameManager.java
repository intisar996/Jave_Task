import java.util.*;

public class StudentNameManager {

    public static void main(String[] args) {


        // create array string
        Deque<String> students = new ArrayDeque<>();
        // open Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Of Students");
        Integer numOfStudent = 0;

        // Validation To Check input if number or not
        if (input.hasNextInt()) {
            numOfStudent = input.nextInt();
            input.nextLine();
        } else {
            System.out.println("Invalid number");
        }

        if (numOfStudent <= 0) {
            System.out.println("Invalid number of students.");
        } else {
            for (int i = 0; i < numOfStudent; i++) {
               System.out.println("enter student name");
                String name = input.next();
                    students.push(name.toLowerCase());
            }

        }


        IO.println(students);
        int choice;

        do {
            //8. Display the following menu using a do-while loop:
            System.out.println("1-Add Student Name");
            System.out.println("2-Search Student Name ");
            System.out.println("3-Update Student Name ");
            System.out.println("4-Display All Student Names");
            System.out.println("5-Analyze Names");
            System.out.println("6-Compare Two Names");
            System.out.println("7-Exit");

            choice = input.nextInt();
            input.nextLine();


            switch (choice) {
                case 1:
                    // add student
                    System.out.println("enter student name");
                    String name = input.next().toLowerCase();
                    if (students.contains(name)) {
                       System.out.println("Student name already exists.");
                    } else {
                        students.push(name);
                       System.out.println(" add the name successfully.");
                    }

                    break;

                case 2:
                    // search student
                    System.out.println("enter student name");
                    String searchName = input.next().toLowerCase();
                    boolean found = false;
                    for (String n : students) {
                        if (n.equals(searchName)) {
                            found = true;
                            break;
                        }
                    }

                    if(found) {
                        System.out.println("Student found");
                    }else {
                        System.out.println("Student not found.");

                    }

                    break;

                case 3:
                    System.out.println("enter Existing student name");
                    String exName = input.next().toLowerCase();
                    List<String> tempName = new ArrayList<>(students);
                    if(students.contains(exName)){
                        System.out.println("enter New student name");
                        String newName = input.next().toLowerCase();

                        for(int i =0; i < students.size(); i++) {
                            if (tempName.get(i).equals(exName)) {
                                tempName.set(i, newName);
                            }
                        }
                        students = new ArrayDeque<>(tempName);

                    }else {
                        System.out.println("Student not found");
                    }

                    break;
                case 4:
                     int index = 1;
                     if(students.isEmpty()) {
                         System.out.println("no student in list");
                     }else {
                         for(Iterator i = students.iterator(); i.hasNext();) {
                             System.out.println(index + "- " +  i.next() + " ");
                             index++;
                         }
                         System.out.println();
                     }
                    break;
                case 5:
                    String Longest = students.getFirst();
                    System.out.println("Longest  " + Longest);
                    String Shortest = students.getFirst();
                    int charAt = 0;
                    int startingA = 0;
                    int endinga = 0;
                    Double average = 0.0;
                    for(String n : students) {
                        charAt += n.length();
                          if(n.length() > Longest.length()) {
                              Longest = n;
                          }

                          if(n.length() < Shortest.length()){
                              Shortest = n;
                          }

                          if(n.startsWith("A")) {
                              startingA++;
                          }
                          if(n.endsWith("a")) {
                              endinga++;
                          }


                    }
                    average = charAt / (double)students.size();
                    System.out.println("Total number of students " + students.size());
                    System.out.println("Longest : " + Longest);
                    System.out.println("Shortest : " + Shortest);
                    System.out.println("Total characters in all names : " + charAt);
                    System.out.println("Average name length   : " + average);
                    System.out.println("Number of names starting with A : " + startingA);
                    System.out.println("Number of names ending with a " + endinga);


                    break;

                case 6 :
                    // Compare Two Names
                   System.out.println("Enter first student name");
                    String name1  = input.nextLine();
                   System.out.println("Enter second student name");
                    String name2  = input.nextLine();

                   System.out.println("equals()  :" + name1.equals(name2));
                   System.out.println("equalsIgnoreCase()  :" + name1.equalsIgnoreCase(name2));
                   System.out.println("compareTo()  :" + name1.compareTo(name2));

                    break;
                case 7 :
                    System.out.println("Exit");
                    break;


                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

        } while (choice != 7);


        System.out.println("students list : " + students);


         input.close();
    }
}
