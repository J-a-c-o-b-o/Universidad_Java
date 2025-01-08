package Section6;

import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de descuentos VIP");
        final var NO_PRODUCTOS_DESCUENTOS = 10;
        var consola = new Scanner(System.in);

        System.out.println("Cuantos productos compraste hoy?");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.println("Tienes la membresía de la tienda (Si/No)?");
        var tienesMembresia = consola.nextLine();
        var respuestaMembresia = tienesMembresia.equalsIgnoreCase("Si")|| tienesMembresia.equalsIgnoreCase("sí")? true:false;
        
        System.out.println("respuestaMembresia (String transformado en booleano)= " + respuestaMembresia);
        
        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTOS && respuestaMembresia;

        var respuestaElegibleDescuento = esElegibleDescuento? "sí":"no";

        System.out.println("El usuario " + respuestaElegibleDescuento + " tiene acceso al descuento VIP");
    }

}
