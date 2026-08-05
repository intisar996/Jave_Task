public class RaiseNumberPower  {

    public static void main(String[] args){


        System.out.println(power(2,10));
    }


    public static  int power(int b, int n){

        if(n == 0) {
            return  1;
        }
             if(n % 2 == 0){
                 return power(b, n/2) * power(b, n/2);
             }else {
                 return b * power(b, n/2) * power(b, n/2);
             }



    }

}
