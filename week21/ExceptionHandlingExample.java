package week21;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            int hardWork = 100;
            int challenge = 0;

            int success = hardWork / challenge;
            System.out.println("Your success rate is: " + success);
        } catch (Exception e) {
            System.out.println("Challenge are necessary for success, can't divide by zero");
        } finally {
            System.out.println("Keep pushing forward!, no matter what the challenge is");
        }
    }
}
