public class StudentGradeCalculator {

    public static  void main(String[] args) {

        Double grade1 = 85.0;
        Double grade2 = 90.0;
        Double grade3 = 90.0;
        Double average = 0.0;
        StringBuilder status = new StringBuilder();


        average = (grade1 + grade2 + grade3) / 3;

        if(average >= 90) {
            status.append("Excellent");
        }else if(average >= 75 ) {
            status.append("Good");
        }else if (average >=60) {
            status.append("Pass");
         }else {
        status.append("Fail");
    }

         System.out.println("grades : " + grade1);
        System.out.println("grades : " + grade2);
        System.out.println("grades : " + grade3);
        System.out.println("average : " + average);
        System.out.println("status : " + status);
    }

    }
