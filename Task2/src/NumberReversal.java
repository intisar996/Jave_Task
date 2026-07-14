public class NumberReversal {

    public static void main(String[] args ) {

        Integer number = 12345;
        Integer original = number;
        Integer reversedNumber = 0;
        Integer digit =0;

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

