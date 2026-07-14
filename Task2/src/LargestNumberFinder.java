import java.util.ArrayList;

public class LargestNumberFinder {

    public static  void main(String[] args) {
        // Declare and initialize variables
     int number;
     int largest =0;

        // create array list to store number for user
        ArrayList<Integer> ListNumber = new ArrayList<>();
        // get number from user and store to listt
        for(int i=1; i <= 5; i++) {

            String enterNum = IO.readln("enter number");
            ListNumber.add(Integer.parseInt(enterNum));
        }

        System.out.println(ListNumber);

        // find largest number using loop + if condition
         for (int j =0; j < ListNumber.size(); j++) {
             if(ListNumber.get(j) > largest) {
                 largest = ListNumber.get(j);
             }

         }
         // print output
        System.out.println(largest);

    }
    }
