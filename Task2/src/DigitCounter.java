public class DigitCounter {
    public static  void main(String[] args) {

        //Declare and initialize the  variables
        int number = 123456;
        int count = 0;
        int orginalNumber = number;
        int digit = 0;


         while(number > 0) {
             digit = number % 10;
             //remove number
             number = number / 10;
             count++;
         }
         //print output
        System.out.println("orginalNumber :" + orginalNumber);
        System.out.println("count :" + count);

    }

}
