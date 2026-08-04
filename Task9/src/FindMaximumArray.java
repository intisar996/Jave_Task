public class FindMaximumArray {
    public static void main(String[] args) {



         int[] x = {3, 7, 2, 9, 4};
        System.out.println(findMax(x,0));
    }

    public static int findMax(int[] arr, int index)  {
        //base case
        if (index == arr.length - 1){
            return arr[index];
        }

         int largest = findMax(arr, index + 1);
        if(arr[index] > largest ) {
             return arr[index];

        }

        return  largest;

    }
}
