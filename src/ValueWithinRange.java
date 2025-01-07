import java.util.Scanner;

public class ValueWithinRange {
    public static void main(String[] args) {
        System.out.println("Enter a value: ");
        var console = new Scanner(System.in);
        int value = Integer.parseInt(console.nextLine());
        System.out.println("value = " + value);

        //It let's give a boolean value to the range variable
        var range = value >= 0 && value <=5? true:false;
        System.out.println("Range = " + range);

        if (range){
            System.out.println("The number entered is within the range");
        }else{
            System.out.println("The number entered is NOT within the range");
        }

    }
}
