package week20;

public class SuucessCalculator {
    public static void main(String[] args) {
        int hardwork = 100;
        int your_hardwork = 0;
        try {
            int result = hardwork/your_hardwork;
            System.out.println("Success rate is: " + result);
        } catch (Exception e) {
            System.out.println("Alikati ta hardwork garnu paryo");
        } finally {
            System.out.println("Success is not a destination, it's a journey.");
        }

    }
}
