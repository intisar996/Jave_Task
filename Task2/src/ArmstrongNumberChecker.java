public class ArmstrongNumberChecker {


    public static  void main(String[] args) {

        //Declare and initialize the variables
        Integer number =153;
        Integer original =number;
        Integer digit = 0;
        Integer sum =0;
        Integer count = 0;
        Integer temp = number;

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
            sum += (int)Math.pow(digit,count);
            // remove number
            number = number /10;
        }
        /* check condiotn */
           if(sum.equals(original) ) {
               System.out.println("The number is an Armstrong number");
           }

    }
}
