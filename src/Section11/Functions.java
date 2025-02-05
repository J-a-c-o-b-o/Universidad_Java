package Section11;

public class Functions {

    static void greet(String message){
        System.out.println("message = " + message);
    }

    static int sum (int a, int b){
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        greet("Hi");
        var resultInMain = sum(2, 4);
        System.out.println("resultInMain = " + resultInMain);
    }
}
