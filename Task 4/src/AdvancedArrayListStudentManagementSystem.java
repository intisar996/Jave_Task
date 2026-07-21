import java.util.*;

public class AdvancedArrayListStudentManagementSystem {

    public static void main(String[] args){
     // 1. Create Student List
        ArrayList<String> students = new ArrayList<>();
        students.add("intisar");
        students.add("yousef");
        students.add("fatma");
        students.add("fars");
        students.add("nada");
        students.add("saba");
        students.add("sawaud");
        students.add("aziz");
        students.add("yazyd");
        students.add("said");

     //2. Display Student Information

        Integer sum = 0;
        for(int i =0; i < students.size(); i++) {
            sum++;
            System.out.println("Student" + i + ":" + students.get(i));
        }

        System.out.println("Total number of students :" + sum);
        System.out.println("Total number of students :" + sum);

        //3. Add New Students
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student name");
        String newStudent = input.nextLine();
        System.out.println("Original students:" + students);

        // Add a student at the end of the list
        students.add(newStudent);
        System.out.println("New Student end of list:" + students);

        //Add a student at a specific position
        students.add(2,newStudent);
        System.out.println("New student at a specific position:" + students);
        System.out.println("Enter student name:" + newStudent);
        System.out.println("Student added successfully");

         //4. Update Student Information

        System.out.println("Enter Student Index");
        Integer index = input.nextInt();
        input.nextLine();
        System.out.println("Enter Student New Name");
        String name = input.nextLine();
        for(int i = 0; i < students.size(); i++) {
            if(index == i) {
                students.set(i ,name);
            }
        }
        System.out.println("Enter index:" + index);
        System.out.println("Enter new name:" + name);
        System.out.println("Updated List:" + students);


    //5. Search Student System

        System.out.println("Enter Student New Name");
        String name1 = input.nextLine();
        boolean found = false;
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).equals(name1)) {
                System.out.println("Student found");
                System.out.println("Student Student index position" + i);
                found = true;
            }
        }

         if(!found) {
             System.out.println("Student Not found");
             students.add(name1);
         }

     //6. Remove Student System
        System.out.println("Enter Student  Name To Remove");


        String nameRemove = input.nextLine();
        students.remove(nameRemove);

        System.out.println("Remove : " + nameRemove);
        System.out.println("After" + students);

       // 7. Student List Analysis
        System.out.println("Count Student  : " + students.size());
        System.out.println("Check is Empty : " + students.isEmpty());
        System.out.println("First Student : " + students.getFirst());
        System.out.println("Last Student : " + students.getLast());

      // 8. Sorting Students


        ArrayList<String> copyStudent = new ArrayList<>(students);
        Collections.sort(copyStudent);
        System.out.println("Sorted Student : " + copyStudent);
        System.out.println("Original Student : " + students);




    }
}
