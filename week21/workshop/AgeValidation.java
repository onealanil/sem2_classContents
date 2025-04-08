package week21.workshop;

import java.util.Scanner;

public class AgeValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                throw new Exception("Age must be 18 or above to vote.");
            }

            System.out.println("You are eligible for voting.");

        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();

        }

    }
}
