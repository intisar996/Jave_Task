public class FibonacciSequence {

    public static  void main(String[] args) {

        //Declare and initialize the  variables
        Integer first = 0;
        Integer second = 1;
        Integer next = 0;

        // print first + second number
        System.out.print(first + " ");
        System.out.print(second + " ");


      for(int i = 3; i <=15;i++){
          next = first + second;
          //swap number
          first = second;
          second = next;
          System.out.print(next + " ");

      }


    }
}
