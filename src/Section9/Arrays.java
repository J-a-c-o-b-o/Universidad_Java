package Section9;

public class Arrays {
    public static void main(String[] args) {
        int[] integers;
        integers = new int[]{100, 200, 300, 400, 500};
        integers[4] = 501;
        System.out.println("last position= " + integers[4]);
        
        int [] numeros = new int[4];
        numeros[3] = 3;
        System.out.println("third position = " + integers[3]);

        for(var i = 0; i< integers.length; i++){
            System.out.println("The content of the array is = " + integers);
        }

        //promedio clasificaciones

    }
}
