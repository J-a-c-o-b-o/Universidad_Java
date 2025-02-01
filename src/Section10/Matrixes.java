package Section10;

import java.util.Scanner;

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

        //Matrix2
        System.out.println("");
        int rows, columns;
        var console = new Scanner(System.in);
        System.out.print("Give the rows for matrix2: ");
        rows = Integer.parseInt(console.next());
        System.out.print("Give the columns for matrix2: ");
        columns = Integer.parseInt(console.next());
        var matrix2 = new int [rows][columns];

        //I'll give the values to the matrix corresponding with the sum of position (e.g: matrix2[1][2] = 3)
        for(var i=0; i<rows ;i++){
            for(var j=0; j<columns ;j++){
                matrix2 [i][j]= i+j;
            }
        }
        //Show the values of the matrix2
        for(var i=0; i<rows ;i++){
            for(var j=0; j<columns ;j++){
                System.out.println("matrix2[" + i + "][" + j +"] = " + matrix2[i][j]);
            }
        }
        //For change some values for console
        System.out.print("Enter the position of the row in matrix2 for row: ");
        var rowPosition = Integer.parseInt(console.next());
        System.out.print("Enter the position of the row in matrix2 for column: ");
        var columnPosition = Integer.parseInt(console.next());
        System.out.print("Which is the new value?: ");
        int newValue = Integer.parseInt(console.next());
        matrix2[rowPosition][columnPosition] = newValue;
        System.out.println("matrix2 in row [" + rowPosition + "]" + " and column [" + columnPosition + "]" + " = " +
                " is = " + newValue);
        //All the values with new value
        System.out.println("\n These are all the values including the new value in the indicated position: ");
        for(var i=0; i<rows ;i++){
            for(var j=0; j<columns ;j++){
                System.out.println("matrix2[" + i + "][" + j +"] = " + matrix2[i][j]);
            }
        }

    }
}
