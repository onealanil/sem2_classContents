package week21;

public class SuccessCal {

    public static void main(String[] args) {
        try {
            int hardwork = 100; //
            int your_work = 20;
            int success = hardwork / your_work;
            System.out.println("your succes rate is" + success);
        } catch (Exception e) {
            System.out.println("Alik hardwork garnu paro, zero le bhayena");
        } finally {
            System.out.println("I am ready for everything");
        }
    }
}
