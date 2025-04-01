package week21;

public class Example1 {

    public static void main(String[] args) {
        //array out of bounds
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
