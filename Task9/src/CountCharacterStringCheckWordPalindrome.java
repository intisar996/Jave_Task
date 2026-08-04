public class CountCharacterStringCheckWordPalindrome {

    public static void main(String[] args) {

        System.out.println(countChar("banana",'a'));
        System.out.println(countChar("apple",'z'));

    }
    public static int countChar(String word, char ch){
        // stop
        if(word.equals("")) {
            return 0;
        }


        if(word.charAt(0) == ch) {
            return  1 + countChar(word.substring(1),ch);
        }



        return  countChar(word.substring(1),ch);

    }
}


