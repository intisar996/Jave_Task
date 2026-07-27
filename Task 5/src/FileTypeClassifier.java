import java.util.ArrayList;
import java.util.List;

public class FileTypeClassifier {

    public static  void main(String[] args) {


        // create list
        List<String> filename = List.of(
                "document.pdf",
                "photo.jpg",
                "presentation.pptx",
                "spreadsheet.xlsx",
                "archive.zip",
                "script.py",
                "notes.txt",
                "README");



         int counterDocument = 0;
         int counterImage = 0;
         int counterCode = 0;
         int counter = 0;


        // init var
          int dots = 0;
          String extension = "";
          // loop to check extension + count
        for(String f : filename) {
            if(f.contains(".")){
                dots = f.lastIndexOf(".");
                extension = f.substring(dots + 1).toLowerCase();
                if(extension.equals("pdf") || extension.equals("txt") || extension.equals("docx") ){
                  counterDocument++;
                }
                else if (extension.equals("jpg")|| extension.equals("gif") || extension.equals("png")) {
                     counterImage++;
                } else if (extension.equals("py")|| extension.equals("cs")) {
                    counterCode++;
                }else {
                     counter++;
                }
            }


            // check file extentions type
            if(extension.equals("txt")
                    || extension.equals("pdf")
                    || extension.equals("docx" )) {
                System.out.println( f + " Document");
            }else if(extension.equals("jpg")
                    || extension.equals("gif") || (extension.equals("png"))) {
                System.out.println(f + " Image");
            }else if(extension.equals("py") ||extension.equals("cs")) {
                System.out.println(f + " Code");
            }else {
                System.out.println(f + " Other");
            }
            }

        // print output
        System.out.println("Total of Document : " + counterDocument);
            System.out.println("Total of Image : " + counterImage);
            System.out.println("Total of Code : " + counterCode);
            System.out.println("Total of Other : " + counter);






    }

}



