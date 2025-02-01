package Section10;

public class Matrixes {
    public static void main(String[] args) {
        final var ROWS = 2;
        final var COLUMNS = 3;
        int [][] matrix = new int[ROWS][COLUMNS];
        matrix[0][0] = 100;
        matrix[0][1] = 200;
        matrix[0][2] = 300;
        matrix[1][0] = 400;
        matrix[1][1] = 500;
        matrix[1][2] = 600;

        System.out.println("The lenght of rows of the matrix is: " + matrix.length);
        System.out.println("The lenght of COLUMNS of the matrix is = " + matrix[0].length + "\n");

        for(var i=0; i<ROWS ;i++){
            for(var j=0; j<COLUMNS ;j++){
                System.out.println("matrix[" + i + "][" + j +"] = " + matrix[i][j]);
            }

        }

    }
}
