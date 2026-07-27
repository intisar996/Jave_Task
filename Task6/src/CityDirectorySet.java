import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class CityDirectorySet {

    public static void main(String[] args) {

        // open Scanner
        Scanner input = new Scanner(System.in);
        // create set
        TreeSet<String> city = new TreeSet<>();
        // ask user to input number of city
        System.out.println("Enter number of city");
        Integer numOfcity = input.nextInt();

        // loop
        for(int i = 0; i <= numOfcity - 1; i++){
            // check number of city
            if(numOfcity <= 0){
                System.out.println("Invalid number of city.");
            }else {
                System.out.println("enter city");
                String cityename = input.next();
                if(city.contains(cityename)) {
                    System.out.println("City already exists. Duplicate entries are not allowed.");
                }else {
                    // add city to set
                    city.add(cityename);
                }
            }
        }


        input.nextLine();
        // search city
        System.out.println("Enter name Of city to search");
        String cityename = input.nextLine();

        if(city.contains(cityename)) {
            System.out.println("City found in the directory.");
        }else{
            System.out.println("City not found in the directory.");
        }

        // classify
        if(city.size() > 10) {
            System.out.println("Large Directory");
        }else if(city.size() > 5) {
            System.out.println(" Medium Directory");
        }else {
            System.out.println(" Small Directory");
        }


        // print output
        System.out.println("Total city :" + numOfcity );
        System.out.println("Total unique city : " + city.size() );
        System.out.println("All unique city : " + city );

        input.close();

    }
}
