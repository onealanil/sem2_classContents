package week21;

public class ThrowsE {

    public static void divide(int a, int b) throws ArithmeticException {
        int c = a / b;
        System.out.println("Result: " + c);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception occurs");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
