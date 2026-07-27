import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentSetManager {

    public  static  void  main(String[] args){

        // open Scanner
        Scanner input = new Scanner(System.in);
        // enter Number of Student
        System.out.println("enter number of Student ");
        // get number of student from user
        Integer numofStudent = input.nextInt();
        Integer id = 0;
        // initalize hash set
        Set<Integer> Ids = new HashSet<>();
        // loop number of student
        for(int i =0; i <=numofStudent-1; i++) {
            // check number of student
            if(numofStudent <= 0 ) {
                System.out.println("Invalid number of students." );
            }else {
                // get ids fom users and check if unique or not
                System.out.println("Enter Student ID");
                id = input.nextInt();
                if(Ids.contains(id)) {
                    System.out.println("Duplicate ID detected. ID was not added." );
                }else {
                    Ids.add(id);
                }
            }

        }


        // check size
        if(Ids.size() > 10) {
            System.out.println("Small Registration");
        } else if (Ids.size() < 10) {
            System.out.println("Medium Registration ");

        }else {
            System.out.println("Small Registration  ");
        }
         // print output
        System.out.println("Total IDs :" + numofStudent );
        System.out.println("Total unique student IDs :" + Ids.size() );
        System.out.println("All unique student IDs  :" + Ids );

         // close scanner
         input.close();
    }
}
