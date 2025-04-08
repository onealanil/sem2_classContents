package week20;

public class App {
    public static void main(String[] args) {
        int x = 5;
        int y = 1;
        try {
            int c = x/y;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Exception occured");
        } finally{
            System.out.println("Finally block executed");
        }
        System.out.println("End of program");

    }
}
