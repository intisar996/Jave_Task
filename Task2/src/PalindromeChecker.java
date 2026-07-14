public class PalindromeChecker {

    public static void main(String[] args ) {

      int number = 1221;
      int originalNumber = 1221;
      int reversedNumber  = 0;
      int digit = 0;

      while (number > 0) {
          //get last number
          digit = number % 10;
          // reversedNumber
          reversedNumber = reversedNumber * 10 + digit;

          // remove number
          number = number /10;
      }
        //check if number is palindrome
        if(reversedNumber == originalNumber) {
            System.out.print("The number is a palindrome");
        }else {
            System.out.print("The number is not a palindrome");
        }

    }

    }








