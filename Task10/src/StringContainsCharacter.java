public class StringContainsCharacter {
    public static void main(String[] args) {
        System.out.println(contains("world", 'z'));


    }
    public static boolean contains(String str , char ch){
        //base case

        if(str.isEmpty()){
            return false;
        }
        // Recursive case
        char f=str.charAt(0);
        if( f == ch ){
            return true;
        }else {
            return contains(str.substring(1),ch);
        }

    }
}