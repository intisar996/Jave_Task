import java.util.Scanner;

public class FilePathSplitter {

    public static  void main(String[] args) {

        // open Scanner
        Scanner input = new Scanner(System.in);
        // input to get file name from user
        IO.readln("enter file name");
        String fileName = input.next();
        // check if fileName Invalid path
        if(fileName.isBlank()){
            System.out.println("Invalid path.");
        }

        if(fileName.contains(""\\"")){
            fileName.replace("\/", "/");
        }


    }
    }
