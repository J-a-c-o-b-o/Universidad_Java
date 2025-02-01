package Section10;

public class DiagonalSumMatrix {
    public static void main(String[] args) {
        final var ROWS = 3;
        final var COLUMNS = 3;
        int sum = 0;

        var matrix = new int [][]{
                {100,200,300},
                {400,500,600},
                {700,800,900}
        };

        for (int i = 0; i<ROWS; i++){
            for(int j = 0; j<COLUMNS; j++){
                if(i == j){
                    int diagonal = matrix[i][j];
                    sum += diagonal;
                    System.out.println("diagonal is = " + diagonal);
                }
            }
        }
        System.out.println("The sum of diagonal is = " + sum);
    }
}
