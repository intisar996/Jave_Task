public class  SumArray {

    public static void main(String[] args) {



        int[] x = {1, 2, 3};
        int[] a = {10, 20, 30, 40};

        System.out.println(sumArray(x, 0));
        System.out.println(sumArray(a, 0));

    }
    public static int sumArray(int[] arr, int index ){
        // stop
        if(index == arr.length) {
            return 0;
        }



        return arr[index] + sumArray(arr, index + 1) ;

    }
}


