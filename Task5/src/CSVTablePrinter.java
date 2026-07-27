import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVTablePrinter
{

    public static void main(String[] args) {
          // create list
        List<String> csvRows  = new ArrayList<>();
         // add header to list
        csvRows.add("Name,Age,City");
       // add data to list
        csvRows.add("yousef, 10, Muscat");
        csvRows.add("fars, 9, Nizwa");
        csvRows.add("bayan,8,Sohar");
        csvRows.add("intisar,30");
        // split header by ,
        String[] header = csvRows.get(0).split(",");

    // Print header
        for(int i = 0; i < header.length; i++) {
            System.out.print( header[i] + "  " );
        }
        System.out.println();
        // Print --

        for(int i = 0; i < header.length; i++) {
            System.out.print("-".repeat(header[0].trim().length()) + " ");
        }
        System.out.println();



        // inti count + print date
        int count = 0;
        for(int i =1; i < csvRows.size(); i++) {
            String[] splitPart = csvRows.get(i).split(",");
            if(splitPart.length == 3){
                count++;
                System.out.println(splitPart[0].trim() + " " +
                        splitPart[1].trim()+ " " +
                        splitPart[2].trim()
                        );
            }else {
                System.out.println("Skipping malformed row :" + Arrays.toString(splitPart));

            }
        }

        // Number or Row
        System.out.println("Number Of Row :" + count);




    }
    }
