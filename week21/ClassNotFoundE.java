package week21;

    class DemoClass {
    }

public class ClassNotFoundE {

    public static void main(String[] args) {
            Class.forName("week21.DemoClass");
            System.out.println("Class found");
     
    }
}
