package Section6;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("What is the height of the rectangle?");
        var console = new Scanner(System.in);
        var height = Integer.parseInt(console.nextLine());
        System.out.println("What is the base of the rectangle?");
        var base = Integer.parseInt(console.nextLine());
        var area  = base * height;
        System.out.println("The area of the rectangle is: " + area);
        var perimeter = 2 * (base + height);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
