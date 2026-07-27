import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CourseEnrollmentSet {
    public static void main(String[] args) {

        // open Scanner
        Scanner input = new Scanner(System.in);
        // create set
        Set<String> course = new HashSet<>();

        // askuser to input number of course
        System.out.println("Enter number of course");
        Integer numOfcourse = input.nextInt();


        // loop
        for(int i = 0; i <= numOfcourse - 1; i++){
            // check number of Course
            if(numOfcourse <= 0){
                System.out.println("Invalid number of course.");
            }else {
                System.out.println("enter course name");
                String coursename = input.next();
                if(course.contains(coursename)) {
                    System.out.println("Course already exists. Duplicate entries are not allowed.");
                }else {
                    // add Course to set
                    course.add(coursename);
                }
            }
        }

        input.nextLine();
        System.out.println("Enter name Of course to remove");
        String coursename = input.nextLine();

        if(course.contains(coursename)) {
            course.remove(coursename);
            System.out.println("Course removed successfully");
        }else {
            System.out.println("Course not found.");
        }


        // check course Catalog
        if(course.size() > 8) {
            System.out.println("Large Course Catalog ");
        }else if(course.size() > 4) {
            System.out.println(" Medium Course Catalog");
        }else {
            System.out.println(" Small Course Catalog");
        }


        // print output
        System.out.println("Total courses :" + numOfcourse );
        System.out.println("Total unique courses : " + course.size() );
        System.out.println("All unique courses : " + course );



      input.close();



    }
    }


