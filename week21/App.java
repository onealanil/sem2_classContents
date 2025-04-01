package week21;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
            
        } catch (ArithmeticException e) {
            System.out.println("Exception founded");
        } finally{
            System.out.println("Always executed");
        }
        System.out.println("program eneded");
    }
}
