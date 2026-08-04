public class LengthofString {

    public static void main(String[] args) {

        System.out.println(length("hello"));



    }

    public static int  length(String word){
//         stop
        if(word.equals("")) {
            return 0;
        }



        return  1 + length(word.substring(1));



    }
}
