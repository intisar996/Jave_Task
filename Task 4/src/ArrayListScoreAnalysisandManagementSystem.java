import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListScoreAnalysisandManagementSystem {
    public static void main(String[] args) {

        // 1. Create Score List
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(70);
        scores.add(95);
        scores.add(80);
        scores.add(50);
        scores.add(100);
        scores.add(60);
        scores.add(40);
        scores.add(70);
        scores.add(51);
        scores.add(53);
        scores.add(34);
        scores.add(25);
        scores.add(70);
        scores.add(83);

        Scanner input = new Scanner(System.in);

        //2 Display scores Information
        int totalScores = scores.size();
        System.out.println("Total scores : " + totalScores);

        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score " + i + ": " + scores.get(i));
        }

        // 3- Calculate Score Statistics
        int total = 0;
        int highest = scores.get(0);
        int lowest = scores.get(0);

        for (int i = 0; i < scores.size(); i++) {
            total += scores.get(i);

            if (scores.get(i) > highest) {
                highest = scores.get(i);
            }

            if (scores.get(i) < lowest) {
                lowest = scores.get(i);
            }
        }

        double average = (double) total / scores.size();

        // Display results
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);



        Integer countPassed = 0;
        Integer countFailed = 0;
        Integer countExcellent = 0;
        Integer countLowGrades = 0;
        //4- Score Classification


        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) >= 90) {
                countExcellent++;
            } else if (scores.get(i) >= 60) {
                countPassed++;
            }
            else if (scores.get(i) < 60 && scores.get(i) > 50) {
                countFailed++;
                }
             else if (scores.get(i) < 50) {
                countLowGrades++;
            }
        }
        System.out.println("Excellent :" + countExcellent);
        System.out.println("Passed :" + countPassed);
        System.out.println("Failed :" + countFailed );
        System.out.println("Low Grades :" + countLowGrades );


        // 5- Search Score System
        System.out.print("Enter score to search: ");
        Integer inputScore = input.nextInt();
        Integer countAppers = 0;

            for(Integer n : scores) {
                if (n.equals(inputScore)) {
                    countAppers++;
                }
            }

            if (countAppers > 0) {
                System.out.println("Score found.");
                System.out.println("First Position: " + scores.indexOf(inputScore));
                System.out.println("Occurrences: " + countAppers);
            }else {
                System.out.println("Score not found.");
            }

        // 6-Update Score System
        System.out.print("Enter index: ");
        int updateIndex = input.nextInt();
            System.out.print("Enter new score: ");
            int newScore = input.nextInt();

            scores.set(updateIndex, newScore);

            System.out.println("Score updated successfully.");
            System.out.println("Updated Scores :" + scores);


        //7-Remove Score System
        System.out.println("Before : " + scores);
        //Remove Score System by value
        System.out.println("Enter score to remove: ");
        int removeScore = input.nextInt();
          scores.remove(Integer.valueOf(removeScore));
        System.out.println("After remove by value: " + scores);

        // Remove student by index
        System.out.println("Enter index to remove: ");
        int removeIndex = input.nextInt();
        scores.remove(removeIndex);

        System.out.println("After remove by index: " + scores);


        // 8. Sorting and Reversing Scores
        ArrayList<Integer> sortedScores = new ArrayList<>(scores);
        ArrayList<Integer> sortedScores1 = new ArrayList<>(scores);
        // Ascending
        Collections.sort(sortedScores, Comparator.naturalOrder());
        //Descending
        Collections.sort(sortedScores1, Comparator.reverseOrder());

        System.out.println("Original List:");
        System.out.println(scores);

        System.out.println("Sorted List Ascending:");
        System.out.println(sortedScores);
        System.out.println("Sorted List Descending:");
        System.out.println(sortedScores1);

        // Display in reverse order
        System.out.println("Sorted List :" + scores);

        System.out.println("Reverse Array:" + scores.reversed());


        System.out.println("Smallest value: " + Collections.min(scores));
        System.out.println("Largest value: " + Collections.max(scores));

        // Clear Score Data
        scores.clear();

        // Display the empty list
        System.out.println("After Clear:");
        System.out.println(scores);

        // Check if the list is empty
        System.out.println("Is Empty: " + scores.isEmpty());

        input.close();
    }
}