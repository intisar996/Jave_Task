import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {


        // open Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("enter password");
        String password = input.nextLine();

        if(password.isEmpty()) {
            System.out.println("Invalid password");
        }else {

            int choice;
            int totalupper = 0;
            int totallower = 0;
            int totaldigit = 0;
            int totalspchar = 0;
            boolean strong = false;
            boolean medium = false;
            boolean weak = false;

            do {
                System.out.println("1-Enter Password ");
                System.out.println("2-Check Password Length");
                System.out.println("3-Analyze Password Characters ");
                System.out.println("4-Check Password Strength ");
                System.out.println("5- Convert Password Format");
                System.out.println("6-Display Password Report ");
                System.out.println("7-Exit");

                System.out.print("Enter choice: ");
                choice = input.nextInt();
                input.nextLine();


                switch (choice) {

                    case 1:
                        System.out.println("Enter new password");
                        password = input.nextLine();
                        if(password.isEmpty()){
                            System.out.println("enter password");
                        }else {
                            System.out.println("Password saved successfully.");
                        }

                        break;

                    case 2:
                        System.out.println("Total number of characters in the password." + password.length());
                        if(password.length() < 8) {
                            System.out.println("Password is too short." );
                        }else {
                            System.out.println("Password length is acceptable." );

                        }

                        break;

                    case 3:


                        totalupper = 0;
                        totallower = 0;
                        totaldigit = 0;
                        totalspchar = 0;
                        for(int i =0; i < password.length(); i++) {

                            char ch = password.charAt(i);
                            if(Character.isUpperCase(ch)) {
                                totalupper++;
                            }
                            else if (Character.isLowerCase(ch)) {
                                totallower++;
                            }
                            else if(Character.isDigit(ch)) {
                                totaldigit++;
                            }
                           else{
                                totalspchar++;
                            }
                        }

                        System.out.println("Uppercase letters:" + totalupper);
                        System.out.println("Lowercase letters:" + totallower);
                        System.out.println("Digits:" + totaldigit);
                        System.out.println("Special characters:" + totalspchar);
                        break;

                    case 4:

                       if(totalupper > 0 && totallower > 0 && totaldigit > 0 && totalspchar > 0 && password.length() >= 8){
                           strong = true;
                       }else if(password.length() >= 8) {
                           medium = true;
                       }else {
                           weak = true;
                       }
                       break;

                    case 5 :

                        System.out.println(" Password in uppercase using toUpperCase()  :" + password.toUpperCase());
                        System.out.println(" Password in lowercase using toLowerCase()  :" + password.toLowerCase());

                            break;
                    case 6 :
                        System.out.println("Password length :" + password.length());
                        System.out.println("First character   :" + password.charAt(0));
                        System.out.println("Last character   :" + password.charAt(password.length() - 1));
                        System.out.println("Number of uppercase letters    :" + totalupper);
                        System.out.println("Number of lowercase letters    :" + totallower);
                        System.out.println("Number of digits    :" + totaldigit);
                        System.out.println("Number of special characters  :" + totalspchar);

                        if(strong) {
                            System.out.println("Strong Password");
                        }else if(medium) {
                            System.out.println("Medium Password");
                        }else {
                            System.out.println("Weak Password");
                        }


                }

                 break;

            }while (choice != 7);
        }


        input.close();

    }

    }
