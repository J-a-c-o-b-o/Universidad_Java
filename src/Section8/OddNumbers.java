package Section8;

public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            if (!(i % 2 == 0)) {
                System.out.println("odd numbers " + "i = " + i);
            }
        }
    }
}
