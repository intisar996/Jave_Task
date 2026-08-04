public class CheckWordPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("a"));

    }
    public static boolean isPalindrome(String n){
        // stop
        if(n.length() <= 1) {
            return true;
        }

          if(n.charAt(0) != n.charAt(n.length()-1 )){
              return  false;
          }

        return  isPalindrome(n.substring(1, n.length()-1));

    }
}


