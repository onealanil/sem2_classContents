package week23;

public class App{
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            int c = x/y;
            System.out.println(c);
            
        } catch (ArithmeticException e) {
            System.out.println("Exception found");
        } finally{
            System.out.println("It always runs");
        }
        System.out.println("Programm ended");
    }
}