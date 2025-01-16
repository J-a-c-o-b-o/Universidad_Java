package Section8;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password;

        do{
            Scanner console = new Scanner(System.in);
            System.out.println("Introduce a password (must be 6 characters): ");
            password = console.nextLine();
            System.out.println("password = " + password);
            if(!isValidPassword(password)){
                System.out.println("The password is NOT correct (it has the length of: " + password.length() + " )");
            }

        }while(!isValidPassword(password));

        if(isValidPassword(password)) {
            System.out.println("The password is correct (it has the length of: " + password.length() + " )");
        }
    }
    public static boolean isValidPassword(String password){
        return password.length()>=6;
    }
}
