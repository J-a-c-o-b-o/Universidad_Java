package Section8;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Do you have to guess a secret number. So put a number: ");
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        Random shuffle = new Random();
        int shuffleNumber = shuffle.nextInt(50)+1;

        System.out.println("The random number is = " + shuffleNumber);
        System.out.println("The number you've said is = " + number);
    }
}
