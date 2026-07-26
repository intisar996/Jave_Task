import java.util.Scanner;

public class FileNameAnalyzer {

    public static  void main(String[] args) {


        // open Scanner
        Scanner input = new Scanner(System.in);
        // input to get file name from user
         IO.readln("enter file name");
         String fileName = input.next();

         // if Condtion to check isBlank , is contains
        if(fileName.isBlank()) {
            System.out.println("Invalid file name");
        }
            if(fileName.contains(".")){
                System.out.println("Invalid file name");
            }

            int dots = fileName.lastIndexOf('.');
        System.out.println(dots);

            if(fileName.contains(".") || fileName.startsWith(".") || fileName.endsWith(".")){
                System.out.println("Invalid file name");
            }

            String baseName = fileName.substring(0, dots);
            String extension  = fileName.substring(dots  + 1);


        // check file extentions type
        if(extension.equals("txt")
                || extension.equals("pdf")
                || extension.equals("docx" )) {
            System.out.println("Document");
        }else if(extension.equals("jpg")
                || extension.equals("gif") || (extension.equals("png"))) {
            System.out.println("Image");
        }else if(extension.equals("mp3") ||extension.equals("wav ")) {
            System.out.println("Audio");
        }else {
            System.out.println("Other");
        }
        // print output
        System.out.println("baseName : " + baseName);
        System.out.println("extension : " + extension);

        input.close();


    }
}
