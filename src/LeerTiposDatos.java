import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        //Leer un tipo int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("Edad: " + edad);

        //Leer un tipo double
        System.out.println("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura: " + altura);
        //Consumir el caracter de salto de linea
        consola.nextLine();

        //Leer un tipo String
        System.out.println("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
