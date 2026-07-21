import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public  class ArrayDataAnalyzer {
    public static void main(String[] args){


     //1. Create and Initialize Array
    int[] numbers =  {45, 12, -5, 90, 33, 12, 0, 67, -20, 88, 45, 100, 7, -3, 55};


      Integer sum = 0;
      Integer largest = 0;
      Integer smallest  = 0;
      Integer positive  = 0;
      Integer negative  = 0;
      Integer zero   = 0;
      Integer odd   = 0;
      Integer even   = 0;
      Integer count = 0;
      ArrayList<Integer> positions = new ArrayList<>();
      // count total number
    for(Integer n : numbers) {
        sum += n;

        if(largest < n) {
            largest =n;
        } else if(smallest > n)  {
            smallest = n;
        }
         if(n > 0) {
             positive++;
         }else if(n  < 0)  {
             negative++;
         }else {
             zero++;
         }

         if(n % 2 == 0 ){
             even++;
         }else {
             odd++;
         }

    }


        // 2. Display Array Information
        System.out.println("Total number of elements :" + (numbers.length - 1));
        System.out.println("First Number :" + numbers[0]);
        System.out.println("Last Number :" + (numbers[numbers.length - 1]));
        for(int i =0; i < numbers.length; i++){
            System.out.println("Index"+ i + " = " + numbers[i]);
        }

        // 3. Array Statistics
        System.out.println("Sum Number :" + sum);
        double average = (double) sum / (numbers.length - 1);
        System.out.println("Average   :" + average);
        System.out.println("Maximum  :" + largest);
        System.out.println("Minimum  :" + smallest);

        //4. Number Classification
        System.out.println("positive   :" + positive );
        System.out.println("negative   :" + negative );
        System.out.println("Zeros   :" + zero  );
        System.out.println("Even Numbers   :" + even );
        System.out.println("Odd Numbers   :" + odd  );

        //5. Search System
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        Integer number =Integer.parseInt(input.nextLine());

         for(int i = 0; i < numbers.length; i++){
             if(numbers[i] == number) {
                 count++;
                 positions.add(i);
             }
         }

        System.out.println(" index position  :" + positions  );
        System.out.println(" Occurrences  :" + count  );


        //6. Update Array Values

        System.out.println("enter index number");
        Integer index = input.nextInt();

        System.out.println("enter new number");
        Integer newNumber = input.nextInt();

        for(int i =0; i < numbers.length; i++){
            if(index.equals(i)) {
                numbers[i] = newNumber;
            }
        }


        System.out.println("Enter index : " + index);
        System.out.println("Enter new value :" + newNumber);
        System.out.println("Updated Array :  " + Arrays.toString(numbers));




        // 7. Reverse Array

        int[] copyNumbers = Arrays.copyOfRange(numbers,0,4);
        int[] reverse = new int[copyNumbers.length];

        System.out.println("Original :" + Arrays.toString(copyNumbers));
        for(int i = copyNumbers.length - 1; i >= 0 ; i--){
             reverse[i] = copyNumbers[copyNumbers.length -1 - i];
        }
        System.out.println(" Reverse :" + Arrays.toString(reverse));

        //8. Sorting and Comparison

        int[] copynum = Arrays.copyOf(numbers,numbers.length);
        Arrays.sort(copynum);
        System.out.println("Sort :" + Arrays.toString(copynum));
        System.out.println("original  :" + Arrays.toString(numbers));
        System.out.println("Smallest value :" + Arrays.stream(numbers).min().getAsInt());
        System.out.println("Largest value  :" + (Arrays.stream(numbers).max().getAsInt()));
        input.close();


    }

}
