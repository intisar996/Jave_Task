import java.util.Scanner;

public class CSVLineParser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        IO.readln("Enter Name,age,City");
        String line = input.nextLine();
        input.close();



      String[] data = line.split(",");

    if(data.length != 3  ) {
        System.out.println("Invalid record.");
        return;
    }

    String name  = data[0].trim();
    int age = Integer.parseInt(data[1].trim());
    String city  = data[2].trim();
    if(age < 18) {
        System.out.println("Minor");
    } else if (age < 64) {
        System.out.println("Adult");

    }else {
        System.out.println("Senior");

    }
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("City :" + city);

    }
    }
