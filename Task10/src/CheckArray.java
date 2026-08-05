public class CheckArray  {

    public static void main(String[] args){


        int[] sort = {1, 5, 2, 8};
        int[] sort1 = {10, 20, 30};
        int[] sort2 = {3, 3, 3};

        System.out.println(isSorted(sort, 0));
        System.out.println(isSorted(sort1, 0));
        System.out.println(isSorted(sort2, 0));

    }


    public static  boolean isSorted(int[] arr,int index){


        if(index == arr.length - 1) {
            return true;
        }
        // stop
        if(arr[index] > arr[index + 1]){
            return false;
        }

        return isSorted(arr,index + 1);



    }

}
