package Section9;

import java.util.Scanner;

public class AverageRankings {
    public static void main(String[] args) {
        //Variables
        Scanner console = new Scanner(System.in);
        int sumOfGrades = 0; //counter
        int grade = 0; //grade introduced
        int[] grades = new int[5]; //all grades array
        char answerOfFinish;
        float sum = 0;
        float average;

        //Fill the array from console
        while(sumOfGrades<5){
            System.out.print("Introduce the grade (max: 5 grades): " + (sumOfGrades+1) + " = ");
            grade = console.nextInt();
            console.nextLine();
            grades [sumOfGrades]= grade;
            sumOfGrades ++;

            //If 5 values have already been introduced, display the message and calculate the average
            if(sumOfGrades == 5){
                System.out.println("You have reached the maximum limit of 5 scores. Entracted scores: ");
                for(int i = 0; i < sumOfGrades; i++){
                    System.out.println("The grade introduced in position: " + (i+1) + " is = " + grades[i]);
                }
                for(int i = 0; i<sumOfGrades; i++){
                    sum += grades[i];
                }
                average = sum / sumOfGrades;
                System.out.println("Average of grades is = " + average);
                break;
            }

            //Ask if the user is over (only if the limit has not been reached)
            System.out.println("Are you finished of introduce the grades? (t/f): ");
            answerOfFinish = console.nextLine().charAt(0);
            if(answerOfFinish == 't') {
                System.out.println("You are finished of introduced the grades");
                for (int i = 0; i < sumOfGrades; i++) {
                    sum += grades[i];
                }
                average = sum / sumOfGrades;
                System.out.println("Average of grades is = " + average);
                break;
            }
        }/*end of while sumOfGrades < 5. Every grade introduced by console, the program continue with the next
         if sumOfGrade < 5 */

        //If the user didn't find the limit of 5, show the grades and average
        if(sumOfGrades<5){
            System.out.println("Grades introduced: ");
            for(int i = 0; i<sumOfGrades; i++){
                System.out.println(grades[i]);
            }
            if (sumOfGrades > 0){
                for(int i = 0; i<sumOfGrades; i++){
                    sum += grades[i];
                }
                average = sum/sumOfGrades;
                System.out.println("average = " + average);
            }else{
                System.out.println("You didn't introduce grades for calculating the average.");
            }

            //Message of exit. End of the program.
            System.out.println("Program finished.");
            console.close();
        }
    }
}



