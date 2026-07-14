public class MultiplicationCalculator {

    public static  void main(String[] args) {

        //Declare and initialize the variables
        Integer start =1;
        Integer end  =5;
        Integer result = 1;


        // Multiply all numbers from start to end
        for(int i = start; i <= end; i++) {
            result = result * i;
        }

          System.out.println("Multiplication Result :" + result);


    }
    }
