public class CountOccurrences {

    public static void main(String[] args){
        System.out.println(countDigit(2222, 2));
        System.out.println(countDigit(12321, 1));
        System.out.println(countDigit(5050, 0));
        System.out.println(countDigit(789, 6));
    }


    public static  int countDigit(int n , int b){

        // stop
        if(n == 0){
            return 0;
        }

        if(n % 10 == b) {
           return  1 + countDigit(n / 10,b);
        }else {
            return countDigit(n / 10,b);

        }

    }

}
