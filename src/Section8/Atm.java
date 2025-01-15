package Section8;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Boolean exitSystem = false;
        Float balance = 0.0F;

        while(!exitSystem){
            System.out.println("""
                \nOperations you can do (for exit the system put option 4): 
                1. Consult balance.
                2. Remove.
                3. Deposit.
                4. Exit. 
                Introduce the number of the option: """);
            var operation = Integer.parseInt(console.nextLine());
            switch (operation){
                case 1 -> {
                    System.out.println("Your balance is: " + balance);
                }
                case 2 -> {
                    System.out.println("Which amount do you want to remove?: ");
                    var remove = Integer.parseInt(console.nextLine());
                    balance -= remove;
                    System.out.println("You are going to remove the amount from your balance: " + remove + "\n");
                }
                case 3 -> {

                    System.out.println("Which amount do you want to deposit?: ");
                    var depositConsole = Float.parseFloat(console.nextLine());
                    balance += depositConsole;
                    System.out.println("You are going to deposit the amount of " + depositConsole + " from your " +
                            "balance \n");
                }
                case 4 -> {
                        System.out.println("Leaving the program");
                        System.exit(0);


                }
            }
        }

    }
}
