package Section9;

import java.util.Scanner;

public class AverageRankings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sumOfGrades = 0;
        int grade = 0;
        String finish = "true";
        String answerOfFinish = "false";
        int[] grades;


        while(sumOfGrades < 10 || answerOfFinish == "false"){
            System.out.println("Introduce the grade (max: 10 grades): ");
            grade = Integer.parseInt(console.nextLine());
                /*if (grade > 10) {
                    System.out.println("The max grade is 10");
                }*/
            grades = new int[grade];
            sumOfGrades += sumOfGrades;
            System.out.println("Are you finish of introduce the grades? (true/false): ");
            answerOfFinish = console.nextLine();
            System.out.println("answerOfFinish = " + answerOfFinish);
            if(answerOfFinish.equals(finish) || sumOfGrades >= 10){
                console.close();
            }

        } ;

            System.out.println("You are finished of introduced the grades");
            console.close();



            int sumOfIntegers = 0;
            int totalSumOfIntegers = 0;
            int average = 0;

        /*for(var i = 0; i<grades.length; i++){
            System.out.println("\n*********** i in index: " + i + " **********");
            System.out.println("Integer value = " + grades[i]);
            System.out.println("sumOfIntegers = " + sumOfIntegers);
            sumOfIntegers += grades[i];
            System.out.println("value integers " + sumOfIntegers + " is equal to = " + sumOfIntegers);
        }*/

            //Average
        /*average = (sumOfIntegers / grades.length);
        System.out.println("\n ***** The average of the grades is = " + average + " *****");*/

    }
}



