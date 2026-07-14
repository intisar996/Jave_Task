public class NumberReversal {

    public static void main(String[] args ) {

        int number = 12345;
        int original = number;
        int reversedNumber = 0;
        int digit =0;

         //Use a loop to reverse the digits  number
        while(number > 0) {
            // get last number
            digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            //remove last digit
            number = number / 10;

        }
        //print output
        System.out.println("original   Number: " + original );
        System.out.println("reversedNumber Number: " + reversedNumber );

    }
}

