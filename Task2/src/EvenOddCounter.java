public class EvenOddCounter {

    public static  void main(String[] args) {
       //Declare and initialize the variables
        Integer start =1;
        Integer end  =5;
        Integer evenCount = 0;
        Integer oddCount = 0;


      // use for loop  and if condition to check even or odd
      for(int i = start; i <= end; i++) {
          if(i % 2 == 0) {
              evenCount++;
          }else {
              oddCount++;
          }
      }
      // print output
       System.out.println(" Even Numbers Count : " + evenCount);
        System.out.println(" Odd Numbers Count " + oddCount);
    }
    }


