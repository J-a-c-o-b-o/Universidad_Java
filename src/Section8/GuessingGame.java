package Section8;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {


        Random shuffle = new Random();
        int shuffleNumber = shuffle.nextInt(50)+1;
        int count = 0;
        int number;

        do{
            System.out.println("Do you have to guess a secret number. So put a number equal or less than 50: ");
            Scanner console = new Scanner(System.in);
            number = Integer.parseInt(console.nextLine());
            if(number > 50){
                System.out.println("The number your're introduced is more than 50. Please introduce a number smaller.");
            }
            //System.out.println("The random number is = " + shuffleNumber);
            System.out.println("The number you've said is = " + number);
            count++;
            System.out.println("count = " + count);
            if(shuffleNumber > number){
                System.out.println("The number your're introduced: " + number + " is less than the random number ");
            }else if(shuffleNumber < number){
                System.out.println("The number your're introduced: " + number + " is more than the random number");
            }
        }
        while(shuffleNumber != number && count < 10);

        if(shuffleNumber == number){
            System.out.println("The number you're introduced is succeful: " + number + " cause the random number is: " + shuffleNumber);
        }else{
            System.exit(0);
        }

    };
}

