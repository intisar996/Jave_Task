public class CountZerosNumber  {

    public static void main(String[] args){


        System.out.println(contains(1020));
        System.out.println(contains(5000));
        System.out.println(contains(123));
        System.out.println(contains(908070));
    }


    public static  int contains(int b){

        if(b == 0) {
            return  0;
        }

        if(b % 10 == 0){
            return 1 + contains(b / 10);
        }else {
            return contains(b / 10);
        }


    }

}
