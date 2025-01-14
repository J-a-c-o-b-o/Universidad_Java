package Section8;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Introduce a number to check if it is a prime number: ");
        int numberIntroduced = Integer.parseInt(console.nextLine());
        System.out.println("Number introduced = " + numberIntroduced);

        if (numberIntroduced <= 1) {
            System.out.println("The number " + numberIntroduced + " is NOT a prime number.");
        } else if (isPrime(numberIntroduced)) {
            System.out.println("The number " + numberIntroduced + " is a prime number.");
        } else {
            System.out.println("The number " + numberIntroduced + " is NOT a prime number.");
        }
        console.close();
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            System.out.println("i = " + i);
            if (number % i == 0) {
                return false; // Si es divisible por i, no es primo.
            }
        }
        return true; // Si no tiene divisores, es primo.
    }
}
