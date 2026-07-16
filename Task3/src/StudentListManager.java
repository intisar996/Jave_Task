import java.util.ArrayList;

public static void main(String[] args) {


    StudentListManager students = new StudentListManager();

    Scanner input = new Scanner(System.in);
      // input to enter and add student
       int i = 0;
       while (i < 10) {
           System.out.println("Enter Student Name");
           String name = input.nextLine();
           if(students.addStudent(name)){
               i++;
           }
    }
    // display output Before remove
    System.out.println("Student List Before remove  :" + students.getStudent());
    System.out.println("Total Number Of Student Before remove  :" + students.studentTotal());
    System.out.println("First  Student  Before remove :" + students.getFisrtStudent());


    // remove student from list
    System.out.println("Enter Student Name You Want remove");
    String removeName = input.nextLine();
    students.removeStudent(removeName);

    // display output After remove
    System.out.println("Student List After remove  :" + students.getStudent());
    System.out.println("Total Number Of Student After remove   :" + students.studentTotal());
    System.out.println("First  Student After remove   :" + students.getFisrtStudent());
    input.close();


   }





public static class StudentListManager {


    // Attributes
    private  ArrayList<String> students;

     // constructor
   public StudentListManager() {
         students = new ArrayList<>();
    }
    // METHODS

    // Add Student To list
    public boolean addStudent(String name) {
           if(students.contains(name)) {
               System.out.println("This name already  add");
               return  false;
           }else {
               students.add(name);
               return  true;
           }
    }

    // list students
    public ArrayList<String> getStudent() {
       return  students;
    }

    //

    // Total Number Of Student
    public int studentTotal() {
      return students.size();
    }

    // First Student
    public String getFisrtStudent() {
       return  students.getFirst();
    }


    // remove student from list
    public void removeStudent(String name) {
        if(students.contains(name)) {
            students.remove(name);
            System.out.println("Student Successfully remove ");
        } else {
            System.out.println("Student not found");
        }

    }





}
