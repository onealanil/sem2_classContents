package week21;

public class SuccessCalculator {

    public static void main(String[] args) {
        int hardwork = 100; //you have to do
        int your_hardwork = 50;
        try {
            int result = hardwork / your_hardwork;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("You have to put some hardwork, for success");
        } finally{
            System.out.println("I am ready for everything");
        }
    }
}
