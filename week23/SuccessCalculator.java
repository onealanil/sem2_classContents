package week23;

public class SuccessCalculator {
    public static void main(String[] args) {
        int hardwork = 100;
        int your_work = 20;

        try {
            int result = hardwork / your_work;
            System.out.println("Success rate: " + result);

        } catch (Exception e) {
            System.out.println("alikati ta hardwork garnu paryo, 0 chai hudaina");
        } finally {
            System.out.println("I am ready for everything");
        }

    }
}
