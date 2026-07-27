import java.util.Scanner;

public class FilePathSplitter {
    public static void main(String[] args){

        //Get file name from user
        Scanner input = new Scanner(System.in);
        IO.readln("Enter File path");
        // read input from user
        String filepath = input.nextLine();

        // check if is Invalid path
        if(filepath.isBlank()){
            System.out.println("Invalid path.");
            return;
        }

        if(filepath.contains("\\")) {
            filepath = filepath.replace("\\", "/");
        }


        int lastpart = filepath.lastIndexOf('/');
        int secondpart = filepath.lastIndexOf('/', lastpart - 1);
        String filename = filepath.substring(lastpart + 1 );
        String foldername = filepath.substring(secondpart + 1 ,lastpart );



        System.out.println("File Path " + filepath);
        System.out.println("Folder Name :" + filename);
        System.out.println("File Name :" + foldername);


        if(filepath.contains("/")) {
            System.out.println("Windows Path");
        }else {
            System.out.println("Unix Path");

        }





        input.close();
    }
}
