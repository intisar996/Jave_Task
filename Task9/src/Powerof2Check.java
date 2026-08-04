public class Powerof2Check {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(16));



    }
    public static boolean isPowerOfTwo(int n){


        // stop
        if(n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        if(n % 2 !=0 ) {
            return false;
        }
         return    isPowerOfTwo(n /2);

    }
}


