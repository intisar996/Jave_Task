public class RemoveCharacte  {

    public static void main(String[] args){


        System.out.println(removeChar("banana" , 'a'));
    }


    public static  String removeChar(String word, char a){
        if(word.equals("")) {
            return "" ;
        }
        char check = word.charAt(0);
        if(check == a) {
            return removeChar(word.substring(1),a);
        } else {
            return check +   removeChar(word.substring(1), a);
        }
    }

}
