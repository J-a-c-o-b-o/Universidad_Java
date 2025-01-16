package Section8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Which is the first number?: ");
        var operatorOne = Float.parseFloat(console.nextLine());

        System.out.println("Which is the second number?: ");
        var operatorTwo = Float.parseFloat(console.nextLine());

        System.out.println("""
        Which operation want you to do?: 
            1. sum
            2. substract
            3. multiply
            4. division
        """);
        var operation = Integer.parseInt(console.nextLine());
        if (operation == 1){
            Float sum = operatorOne + operatorTwo;
            System.out.println("sum = " + sum);
        } else if (operation == 2) {
            Float substract = operatorOne - operatorTwo;
            System.out.println("substract = " + substract);
        } else if (operation == 3) {
            Float multiply = operatorOne * operatorTwo;
            System.out.println("multiply = " + multiply);
        } else if (operation == 4) {
            Float division = operatorOne / operatorTwo;
            System.out.println("division = " + division);
        }



    }
}
