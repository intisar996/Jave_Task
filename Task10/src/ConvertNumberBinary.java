public class ConvertNumberBinary  {

    public static void main(String[] args){


        System.out.println(toBinary(2));
        System.out.println(toBinary(5));
        System.out.println(toBinary(10));
        System.out.println(toBinary(1));

    }


    public static  String toBinary(int b){

        if(b == 0) {
           return "";
        }


         if(b % 2 == 0) {
             return  toBinary(b / 2) + "0";
         }else {
             return  toBinary(b /2)  + "1";
         }




    }

}
