package Section11;

public class Functions {

    static void greet(String message){
        System.out.println("message = " + message);
    }

    static int sum (int a, int b){
        int resultSum = a + b;
        return resultSum;
    }

    static int rest (int c, int d){
        var resultRest = c - d;
        return resultRest;
    }

    static int multiply(int e, int f){
        return e * f;
    }

    public static void main(String[] args) {
        //Void method is called for give a value as paramether
        greet("Hi");

        //sum method (values of parameters in the call of method
        var resultInMainSum = sum(2, 4);
        System.out.println("resultInMainSum = " + resultInMainSum);

        //rest method (declaring variables in main method for use these variables in the call of method)
        int argC = 8, argD = 3;
        var resultInMainRest = rest( argC, argD);
        System.out.println("resultInMainRest = " + resultInMainRest);

        //multiply method (returning multiply without declaring variables in method)
        String messageInMainMultiply = "multiply return variables f and d: ";
        System.out.println(multiply(2,4));;
    }
}
