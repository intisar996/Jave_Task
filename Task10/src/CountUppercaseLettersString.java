public class CountUppercaseLettersString  {

    public static void main(String[] args){


        System.out.println(countUpper("JavaProgram"));


    }


    public static  int countUpper(String str){

        if(str.equals("")) {
            return 0;
        }


        char x = str.charAt(0);
        if(Character.isUpperCase(x)) {
          return 1 + countUpper(str.substring(1));
        }else {
            return countUpper(str.substring(1));
        }









    }

}
