package Section5;

import java.util.Scanner;

public class Clase_Scanner {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Introduce una línea de texto");
        var linea = scanner.nextLine();
        System.out.println("La línea introducida es: " + linea);
    }
}
