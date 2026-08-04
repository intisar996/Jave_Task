public class CountDigitsNumber {

    public static void main(String[] args) {

        System.out.println(countDigits(44));



    }

    public static int  countDigits(int n){
        // stop
        if(n == 0) {
            return 0;
        }

        return  1 + countDigits(n / 10);



    }
}
