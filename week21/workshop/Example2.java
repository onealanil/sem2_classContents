package week21.workshop;

public class Example2 {

    public static void main(String[] args) {
        try {
            int[] age = {10, 20, 25, 24, 28, 27, 30, 31, 32};
            System.out.println(age[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
