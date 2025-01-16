package Section8;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Introduce a password (must be 6 characters): ");
        var password = console.nextLine();
        System.out.println("password = " + password);
        int characters = 0;
        int minCharacters = 6;
        
        while(characters < 6){
            System.out.println("The minimun of characters is 6. You've putted: " + characters);
        }
        
    }
}
