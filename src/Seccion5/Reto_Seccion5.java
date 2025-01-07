package Seccion5;

import java.util.Random;
import java.util.Scanner;

public class Reto_Seccion5 {
    /**El programa debe solicitar al usuario:
     * -Nombre: James -> JA
     * - Apellido: Jamison -> JA
     * - Año nacimiento: 1991 -> 91
     * - Debe generar un número aleatorio de 4 dígitos, si es menor deberá completarse con ceros a la izquierda. P.ej: 1234
     * - ID Unico: JAJA911234
     * **/
    public static void main(String[] args) {
        //Nombre
        var consola = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        var subcadenaNombre = nombre.substring(0, 2).toUpperCase();
        System.out.println("Subcadena nombre: " + subcadenaNombre);

        //Apellido
        System.out.println("Ingresa tu apellido: ");
        var apellido = consola.nextLine();
        var subcadenaApellido = apellido.substring(0, 2).toUpperCase();
        System.out.println("Subcadena apellido: " + subcadenaApellido);

        //Año
        System.out.println("Ingresa el año de nacimiento: ");
        var anio = consola.nextInt();
        var toStringAnio = Integer.toString(anio);
        var subcadenaAnio = toStringAnio.substring(2, 4);
        System.out.println("Subcadena año: " + subcadenaAnio);

        //Numero aleatorio
        Random random = new Random();
        var numeroAleatorio = random.nextInt(0000, 10000);
        var numeroAleatorioFormat = String.format("%04d", numeroAleatorio);
        System.out.println("Numero aleatorio generado: " + numeroAleatorioFormat);

        //ID Unico
        var iD = subcadenaNombre + subcadenaApellido + subcadenaAnio + numeroAleatorio;
        System.out.printf("""
    %n %s, 
    \t Tu id único es:
    \t %s 
    """, nombre, iD);

    }

}
