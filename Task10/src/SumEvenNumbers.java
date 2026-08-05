public class SumEvenNumbers {

    public static void main(String[] args){
        System.out.println(printReverse(6));

    }


    public static  int printReverse(int n){

        // stop
        if(n == 0){
            return 0;
        }
        if(n % 2 == 0){
            return n + printReverse(n - 1);
        }else {
            return printReverse(n - 1);
        }


    }

}
