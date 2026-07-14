public class DigitFrequencyCounter {


    public static  void main(String[] args) {
        //Declare and initialize the variables


        int number =122333;
        int original =number;
        int targetDigit = 3;
        int digit =0;
        int count = 0;

      // loop
        while(number > 0 ) {
            // extract number
            digit = number % 10;
            // checkif equals digit number and count
            if(digit == targetDigit) {
                count++;
            }
            // remove number
            number =number / 10;
        }
        // print output
        System.out.println("Number:" + original);
        System.out.println("Target Digit:" + targetDigit);
        System.out.println("Frequency:" + count);


    }

}
