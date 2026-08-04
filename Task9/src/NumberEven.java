 public class NumberEven {
    public static void main(String[] args) {

        System.out.println(isEven(0));
    }

    public static boolean isEven(int n)  {
        //base case
        if (n ==0){
            return true;
        }
        if (  n == 1 ){
            return false;
        }
        // Recursive case
        return isEven(n -2);

    }
}
