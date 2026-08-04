public class PrintNumbers {

    public static void main(String[] args) {

        printUp(5);



    }

    public static void printUp(int n){

        // stop
        if(n == 1) {
            System.out.println(1);
            return;
        }

        printUp(n - 1);
        System.out.println(n);


    }
}
