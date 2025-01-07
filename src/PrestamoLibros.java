import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        var console = new Scanner(System.in); 
        var user = console.nextLine();
        System.out.println("user = " + user);
        System.out.println("How many kilometres do you live from here?");
        var kms = console.nextLine();
        System.out.println("kms = " + kms);
        var kmsToInt = Integer.parseInt(kms);
        var noMoreThan3kms = kmsToInt <= 3?true:false;
        System.out.println("noMoreThan3kms = " + noMoreThan3kms);
        if(noMoreThan3kms){
            System.out.println("We can lend you books");
        }else{
            System.out.println("We CAN'T lend you books");
        }


    }
}
