package Section9;

public class AverageRankings {
    public static void main(String[] args) {
        int [] integers = new int[]{5, 6, 7, 3, 5, 6};
        int sumOfIntegers = 0;
        int totalSumOfIntegers = 0;
        int average = 0;

        for(var i = 0; i<integers.length; i++){
            System.out.println("\n*********** i in index: " + i + " **********");
            System.out.println("Integer value = " + integers[i]);
            System.out.println("sumOfIntegers = " + sumOfIntegers);
            sumOfIntegers += integers[i];
            System.out.println("value integers " + sumOfIntegers + " is equal to = " + sumOfIntegers);
        }

        average = (sumOfIntegers / integers.length);
        System.out.println("\n ***** The average of the grades is = " + average + " *****");
    }


}
