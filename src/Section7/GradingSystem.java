package Section7;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        System.out.println("What grade did you get (from 0 to 10)?");
        var console = new Scanner(System.in);
        var grade = Integer.parseInt(console.nextLine());
        String letterGrade;
        //System.out.println("grade = " + grade);

        if(grade >= 9){
            letterGrade = "A";
        } else if (grade >=8 && grade <9) {
            letterGrade = "B";
        } else if (grade >= 7 && grade < 8) {
            letterGrade = "C";
        } else if (grade <= 6){
            letterGrade = "D";
        }else{
            letterGrade = "You have entered incorrect punctuation";
        }

        System.out.println("Your grade isa = " + letterGrade);
    }
}
