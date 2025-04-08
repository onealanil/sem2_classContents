package week23;

public class Example {

    //divide
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
    public static void main(String[] args) {
        try{
            divide(10, 0);

        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("End of program");
    }
}
