package Section8;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Which number of row do you want have the triangle: ");
        Scanner rows = new Scanner(System.in);
        int rowsIntroduced = Integer.parseInt(rows.nextLine());
        int print;
        int base;
        base = rowsIntroduced + (rowsIntroduced - 1);
        System.out.println("base = " + base);
        Float firstAsterisc = (float) ((base/2)+0.5);
        System.out.println("firstAsterisc = " + firstAsterisc);

        for(int i = 0; i < rowsIntroduced; i++) {
            // Calculate the number of stars (1, 3, 5, 7, ...)
            int stars = 2 * i + 1; //1a = 1; 2a = 3; 3a = 5; 4a = 7;

            // Calculate the spaces before the stars (for centring)
            int spaces = (rowsIntroduced - stars) / 2;

            // Print the spaces before the stars
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");  // Spaces before the stars
            }

            // Imprimir las estrellas
            for (int j = 0; j < stars; j++) {
                System.out.print("*");  // Estrellas
            }

            // Imprimir los espacios después de las estrellas (si los hay)
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");  // Espacios después de las estrellas
            }

            // Salto de línea después de cada fila
            System.out.println();



            /**if(i % 2 == 0){
                String space = " ";
                String asterisk = "*";
                int lastRow;
                int firstRow;
                System.out.println("i pairs = " + i);
            }**/
            /**if(i % 2 != 0){
                String space = " ";
                String asterisk = "*";
                int lastRow;
                int firstRow;
                System.out.println("i odds = " + i);
            };**/
        };
        /*for (print = 1; print<=rowsIntroduced; print++){

            System.out.println("print = " + print);
        }*/
    }
}
