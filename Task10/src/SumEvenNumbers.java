public class SumEvenNumbers {

    public static void main(String[] args){
        System.out.println(SumEven(6));

    }


    public static  int SumEven(int n){

        // stop
        if(n == 0){
            return 0;
        }
        if(n % 2 == 0){
            return n + SumEven(n - 1);
        }else {
            return SumEven(n - 1);
        }


    }

}
