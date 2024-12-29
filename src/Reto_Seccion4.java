public class Reto_Seccion4 {
    public static void main(String[] args) {
        //Generador de Email a partir de los siguientes datos:
        var nombreUsuario = "Jacobo Jim Pul";
        var nombreEmpresa = "Global Mentoring";
        var extensionDominio = ".com.es";

        /**Tengo que transformar los anteriores datos para que me genere lo siguiente: Usuario Normalizado = "jacobo.jim.pul" Dominio Email Normalizado = "@.globalmentoring.com.es"**/

        //Para generar este resultado final: "jacobo.jim.pul.@globalmentoring.com.es";

        //Empezar:
        var reemplazaEspacioUsuario = nombreUsuario.replace(' ', '.');
        System.out.println("reemplazaEspacioUsuario: " + reemplazaEspacioUsuario);

        var minusculasSinEspaciosUsuario = reemplazaEspacioUsuario.toLowerCase();
        System.out.println("minusculasSinEspaciosUsuario: " + minusculasSinEspaciosUsuario);

        var minusculasEmpresa = nombreEmpresa.toLowerCase();
        System.out.println("minusculasEmpresa: " + minusculasEmpresa);

        var subcadena1 = minusculasEmpresa.substring(0, 6);
        var subcadena2 = minusculasEmpresa.substring(7, 16);
        var minusculasSinEspaciosEmpresa = subcadena1 + subcadena2;
        System.out.println("subcadenas unidas: " + subcadena1+subcadena2);

        //Uno todo para el resultado final
        System.out.println("resultado final: " + minusculasSinEspaciosUsuario + '@' + minusculasSinEspaciosEmpresa + extensionDominio);

    }


}
