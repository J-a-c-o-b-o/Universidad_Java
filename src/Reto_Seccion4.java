public class Reto_Seccion4 {
    public static void main(String[] args) {
        //Generador de Email a partir de los siguientes datos:
        var nombreUsuario = "Jacobo Jim Pul";
        var nombreEmpresa = "Global Mentoring";
        var extensionDominio = ".com.es";

        //Tengo que usar estos datos:
        var usuarioNormalizado = "jacobo.jim.pul";
        var dominioEmailNormalizado = "@.globalmentoring.com.es";

        //Para generar este resultado final:
        var emailFinalGenerado = "jacobo.jim.pul.@globalmentoring.com.es";

        System.out.println(emailFinalGenerado);
    }


}
