import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAttendanceManager {


    public static void main(String[] args) {
        // open Scanner
        Scanner input = new Scanner(System.in);

        // create map
        Map<Integer, Integer> student = new HashMap<>();

        // ask user to input number of students
        System.out.println("Enter number of students");
        Integer numOfstudent = input.nextInt();

        for (int i = 0; i <= numOfstudent - 1; i++) {

            // check number of students
            if (numOfstudent <= 0) {
                System.out.println("Invalid number of students.");
            } else {

                System.out.println("Enter student ID");
                Integer sid = input.nextInt();

                if (student.containsKey(sid)) {
                    System.out.println("Student ID already exists. Record not added.");
                } else {

                    System.out.println("Enter number of attended days");
                    Integer days = input.nextInt();

                    // add student record to map
                    student.put(sid, days);
                }
            }
        }


        int choice;

        do {

            System.out.println("1-Add Student Record");
            System.out.println("2-Search Student Attendance");
            System.out.println("3-Update Attendance");
            System.out.println("4-Remove Student Record");
            System.out.println("5-Display All Attendance Records");
            System.out.println("6-Display Attendance Statistics");
            System.out.println("7-Exit");


            choice = input.nextInt();


            switch (choice) {

                case 1:
                    // Add Student Record
                    System.out.println("Enter student ID");
                    Integer newSid = input.nextInt();

                    if (student.containsKey(newSid)) {
                        System.out.println("Student ID already exists.");
                    } else {

                        System.out.println("Enter attendance days");
                        Integer attendance = input.nextInt();

                        student.put(newSid, attendance);
                    }

                    break;


                case 2:
                    // Search Student Attendance
                    System.out.println("Enter student ID");
                    Integer searchId = input.nextInt();

                    if (student.containsKey(searchId)) {
                        System.out.println("Attendance days: " + student.get(searchId));
                    } else {
                        System.out.println("Student not found");
                    }

                    break;


                case 3:
                    // Update Attendance
                    System.out.println("Enter student ID");
                    Integer updateId = input.nextInt();

                    if (student.containsKey(updateId)) {

                        System.out.println("Enter new attendance days");
                        Integer newDays = input.nextInt();

                        student.replace(updateId, newDays);

                    } else {
                        System.out.println("Student not found");
                    }

                    break;


                case 4:
                    // Remove Student Record
                    System.out.println("Enter student ID");
                    Integer removeId = input.nextInt();

                    if (student.containsKey(removeId)) {
                        student.remove(removeId);
                        System.out.println("Student removed successfully.");
                    } else {
                        System.out.println("Student not found");
                    }

                    break;


                case 5:
                    // Display All Attendance Records
                    System.out.println("Display all student IDs and attendance days:");

                    for (Integer id : student.keySet()) {
                        System.out.println("Student ID: " + id +
                                " Attendance Days: " + student.get(id));
                    }

                    break;


                case 6:
                    // Display Attendance Statistics

                    Integer totalStudents = student.size();
                    Integer totalAttendance = 0;

                    Integer highestAttendance = 0;
                    Integer lowestAttendance = Integer.MAX_VALUE;

                    Integer highestId = 0;
                    Integer lowestId = 0;


                    for (Integer id : student.keySet()) {

                        Integer days = student.get(id);

                        totalAttendance += days;


                        if (days > highestAttendance) {
                            highestAttendance = days;
                            highestId = id;
                        }


                        if (days < lowestAttendance) {
                            lowestAttendance = days;
                            lowestId = id;
                        }
                    }


                    double averageAttendance = totalAttendance / (double) student.size();


                    System.out.println("Total number of students: " + totalStudents);

                    System.out.println("Total attendance days: " + totalAttendance);

                    System.out.println("Average attendance: " + averageAttendance);

                    System.out.println("Student with highest attendance: " + highestId);
                    System.out.println("Attendance days: " + highestAttendance);

                    System.out.println("Student with lowest attendance: " + lowestId);
                    System.out.println("Attendance days: " + lowestAttendance);


                    break;


                case 7:
                    System.out.println("Exit");
                    break;

            }


        } while (choice != 7);


        input.close();

    }

}
