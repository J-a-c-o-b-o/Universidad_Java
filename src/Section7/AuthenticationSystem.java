package Section7;

import Section6.BookLoan;

import java.util.Scanner;

public class AuthenticationSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your username to register in the system: ");
        var username = console.nextLine();
        final String finalUsername = username;

        System.out.println("Enter your password to register in the system");
        var password = console.nextLine();
        final String finalPassword = password;

        Boolean validInputUsername = false;
        Boolean validInputPassword = false;

        do{
            System.out.println("Introduce your username: ");
            var userNameIntroduced = console.nextLine();

            System.out.println("Introduce your password");
            var passwordIntroduced = console.nextLine();

            if(finalUsername == userNameIntroduced && finalPassword == passwordIntroduced){
                System.out.println("Welcome to the system");
                validInputUsername = true;
                validInputPassword = true;
            }else if(finalUsername == userNameIntroduced && finalPassword != passwordIntroduced) {
                System.out.println("Invalid password: " + passwordIntroduced);
                validInputPassword = false;
                validInputUsername = true;
            } else if (finalUsername != userNameIntroduced && finalPassword == passwordIntroduced) {
                System.out.println("Invalid username: " + userNameIntroduced);
                validInputPassword = true;
                validInputUsername = false;
            } else if (finalUsername != userNameIntroduced && finalPassword != passwordIntroduced) {
                System.out.println("Your username: " + userNameIntroduced + " is wrong. " + "And your password: " + passwordIntroduced + " is wrong too");
            }
        }while(!validInputPassword && !validInputPassword || !validInputPassword && validInputUsername || !validInputUsername && validInputPassword);

    }
}
