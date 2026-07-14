public class StudentGradeCalculator {

    public static  void main(String[] args) {

        double grade1 = 85;
        double grade2 = 90;
        double grade3 = 90;
        double average = 0.0;
        String status ="";


        average = (grade1 + grade2 + grade3) / 3;

        if(average >= 90) {
            status = "Excellent";
        }else if(average >= 75 ) {
            status = " Good";
        }else if (average >=60) {
            status = "Pass";
         }else {
        status = "Fail";
    }

         System.out.println("grades : " + grade1);
        System.out.println("grades : " + grade2);
        System.out.println("grades : " + grade3);
        System.out.println("average : " + average);
        System.out.println("status : " + status);
    }

    }
