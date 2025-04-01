package week22;

public class App {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int x = a / b;
            System.out.println(x);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: founded");
        } finally {
            System.out.println("It always runs");
        }
        System.out.println("Program Ended");

    }
}
