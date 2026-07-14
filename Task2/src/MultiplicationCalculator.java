public class MultiplicationCalculator {

    public static  void main(String[] args) {

        //Declare and initialize the variables
        int start =1;
        int end  =5;
        int result = 1;


        // Multiply all numbers from start to end
        for(int i = start; i <= end; i++) {
            result = result * i;
        }

          System.out.println("Multiplication Result :" + result);


    }
    }
