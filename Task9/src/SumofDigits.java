public class SumofDigits {

    public static void main(String[] args) {

        System.out.println(sumDigits(999));



    }

    public static int  sumDigits(int n){
//         stop
        if(n == 0) {
            return 0;
        }

        return  (n % 10) + sumDigits(n / 10);



    }
}



