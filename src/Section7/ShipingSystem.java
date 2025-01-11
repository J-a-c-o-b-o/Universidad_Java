package Section7;

import java.util.Scanner;

public class ShipingSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What are the destiny of your shipment?: (International/National)");
        String destiny = console.nextLine();
        String destinyInternational = null;
        String destinyNational = null;

        if(destiny.equalsIgnoreCase("International")){
            destinyInternational = destiny;
        }else if(destiny.equalsIgnoreCase("National")){
            destinyNational = destiny;
        }else{
            System.out.println("The answer inputted is wrong");
        }

        //boolean destinyInternational = destiny.equalsIgnoreCase(destiny)? true:false;
        //var destinyNational = destiny.equalsIgnoreCase(destiny)? true:false;
        System.out.println("destiny = " + destiny);
        System.out.println("destinyInternational = " + destinyInternational);
        System.out.println("destinyNational = " + destinyNational);
        
        System.out.println("How much weight is it?: (in kgs)");
        var weight = Float.parseFloat(console.nextLine());
        System.out.println("weight = " + weight);
        
        float tariff;
        if(destiny == destinyNational){
            tariff = weight * 10;
        }else{
            tariff = weight * 20;
        }
        System.out.println("The tariff of your shipment is = " + tariff);
    }
}
