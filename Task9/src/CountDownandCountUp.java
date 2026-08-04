public class CountDownandCountUp {

    public static void main(String[] args) {

        countDownUp(3);



    }

    public static void countDownUp(int n){

         // stop
        if(n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println("Down :" + n);
        countDownUp(n - 1);

        System.out.println("Up : " + n);

    }
}
