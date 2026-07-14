public class DecimalToBinary {


    public static  void main(String[] args) {

     Integer number = 25;
     Integer original = 25;
     String binary ="";
     Integer remainder = 0;

      while(number > 0) {
           remainder = number % 2;

          binary = remainder + binary;
          number = number /2;
      }
        System.out.println("Binary Number" + binary);
        System.out.println("Decimal Number" + original);
    }
}



