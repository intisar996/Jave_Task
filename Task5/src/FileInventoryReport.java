import java.util.ArrayList;
import java.util.List;

public class FileInventoryReport {

    public static void main(String[] args) {

        List<String> CVS = new ArrayList<>();
        CVS.add("photo.xx,340");
        CVS.add("app.java,8");
        CVS.add("photo2.pdf,200");
        CVS.add("photo3.png,100");
        CVS.add("project.js,9");
        CVS.add("onlineshop.py,500");

        int countDocument = 0;
        int countImage = 0;
        int countAudio = 0;
        int countCode = 0;
        int Other = 0;
        int largest = 0;
        int total = 0;
        String largestFile = "";

        // loop CVS to check file type
        for (int i = 0; i < CVS.size(); i++) {
            String row = CVS.get(i);

            int dot = row.lastIndexOf(".");
            int dot2 = row.lastIndexOf(",");

            String sup = row.substring(dot + 1, dot2).trim();
            String filesize = row.substring(dot2 + 1).trim();

            System.out.println("size  " + filesize);
            System.out.println("extension : " + sup);

            int size = Integer.parseInt(filesize);
            total += size;

            // check largest file
            if (size > largest) {
                largest = size;
                largestFile = row;
            }

            // check file path type
            if (sup.equals("pdf") || sup.equals("txt") || sup.equals("docx") || sup.equals("xlsx")) {
                System.out.println("Document");
                countDocument++;
            } else if (sup.equals("jpg") || sup.equals("png") || sup.equals("gif")) {
                System.out.println("Image");
                countImage++;
            } else if (sup.equals("mp3") || sup.equals("wav")) {
                System.out.println("Audio");
                countAudio++;
            } else if (sup.equals("java") || sup.equals("py") || sup.equals("js")) {
                System.out.println("Code");
                countCode++;
            } else {
                System.out.println("Other");
                Other++;
            }
        }

        // print output
        System.out.println("Document : " + countDocument);
        System.out.println("Image : " + countImage);
        System.out.println("Audio : " + countAudio);
        System.out.println("Code : " + countCode);
        System.out.println("Other : " + Other);
        System.out.println("Total size : " + total);
        System.out.println("Largest file : " + largestFile + " (" + largest + ")");
    }
}
