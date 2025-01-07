package Seccion6;
import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        var apples = 0.78;
        var pears = 0.60;
        var peaches = 0.82;
        var melon = 2.4;
        var watermelon = 3.20;

        System.out.println("Which fruit do you want");
        var console = new Scanner(System.in);
        var fruitName = console.nextLine().toLowerCase();
        double fruitPrice;

        switch (fruitName){
            case "apples":
                fruitPrice = apples;
                break;
            case "pears":
                fruitPrice = pears;
                break;
            case "melon":
                fruitPrice = melon;
            case "watermelon":
                fruitPrice = watermelon;
                break;
            default:
                System.out.println("Invalid fruit");
                return;
        }

        var taxes = 0.2;
        var finalPrice =  (fruitPrice * taxes) + fruitPrice;
        System.out.printf("The final price is: %.2f", finalPrice);

    }

}
