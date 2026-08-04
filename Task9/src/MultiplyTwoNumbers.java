public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        System.out.println(multiply(3,4));



    }

    public static int  multiply(int a, int b){

        // stop
        if(b == 0) {
            return 0;
        }

        return a + multiply(a, b - 1);



    }
}
