package week21;

class DemoClass {
}

public class ClassNotFoundE {

    public static void main(String[] args) {
        try {
            Class.forName("week21.DemoClass");
            System.out.println("Class found");
            
        } catch (Exception e) {
        }

    }
}
