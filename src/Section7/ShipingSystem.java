package Section7;

import java.util.Scanner;

public class ShipingSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String destiny;
        String destinyInternational = null;
        String destinyNational = null;
        boolean validInput = false;

        do {
            System.out.println("What are the destiny of your shipment?: (International/National)");
            destiny = console.nextLine();

            if(destiny.equalsIgnoreCase("International")){
                destinyInternational = destiny;
                validInput = true;
            }else if(destiny.equalsIgnoreCase("National")){
                destinyNational = destiny;
                validInput = true;
            }else{
                System.out.println("The answer inputted is wrong");
            }
        }while(!validInput);

        if (destiny == destinyNational || destiny == destinyInternational){
            System.out.println("Your answer is correct. ");
            System.out.println("destiny = " + destiny);
            System.out.println("destinyInternational = " + destinyInternational);
            System.out.println("destinyNational = " + destinyNational);

            System.out.println("How much weight is it?: (in kgs)");
            var weight = Float.parseFloat(console.nextLine());
            System.out.println("weight = " + weight);

            float tariff = 0;

            if(destiny == destinyNational){
                tariff = weight * 10;
            }else if(destiny == destinyInternational){
                tariff = weight * 20;
            }else{
                System.out.println("The answer inputted is wrong");
            }
            System.out.println("The tariff of your shipment is = " + tariff);
        }
    }

        //boolean destinyInternational = destiny.equalsIgnoreCase(destiny)? true:false;
        //var destinyNational = destiny.equalsIgnoreCase(destiny)? true:false;

}
