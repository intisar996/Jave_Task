public class SumArrayElementsEvenIndexes  {

    public static void main(String[] args){



        int[] sum = {1, 2, 3, 4};
        System.out.println(sumEvenInd(sum,0));

    }


    public static  int sumEvenInd(int[] b,int index){

        if(index > b.length - 1 ) {
            return  0;
        }

              return b[index] + sumEvenInd(b,index + 2) ;


    }

}
