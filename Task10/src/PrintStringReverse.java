public class PrintStringReverse {

    public static void main(String[] args){
        printReverse("cat");

    }


     public static  void printReverse(String word){

        // stop
         if(word.length() == 0){
             return ;
         }
         printReverse(word.substring(1));

         System.out.println(word.charAt(0));



     }

}
