public class ArmstrongNumberChecker {


    public static  void main(String[] args) {

        //Declare and initialize the variables
        int number =153;
        int original =number;
        int digit = 0;
        int sum =0;
        int count = 0;
        int temp = number;

        // count how many digit in number
         while(temp > 0 ) {
             count++;
             // remove number
             temp = temp /10;
         }
        //use loop
        while(number > 0 ){
             // extract number
            digit = number % 10;
           // sum + muli pow
            sum += Math.pow(digit,count);
            // remove number
            number = number /10;
        }
        /* check condiotn */
           if(sum == original) {
               System.out.println("The number is an Armstrong number");
           }

    }
}
