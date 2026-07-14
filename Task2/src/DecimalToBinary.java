public class DecimalToBinary {


    public static  void main(String[] args) {

     int number = 25;
     int original = 25;
     String binary ="";
     int remainder = 0;

      while(number > 0) {
           remainder = number % 2;

          binary = remainder + binary;
          number = number /2;
      }
        System.out.println("Binary Number" + binary);
        System.out.println("Decimal Number" + original);
    }
}



