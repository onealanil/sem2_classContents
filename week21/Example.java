package week21;

// Custom exception class
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Example {

    public static void main(String[] args) {
        int x = 12;
        if (x < 18) {
            try {
                throw new InvalidAgeException("You are not eligible to vote");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("You can vote");
        }
    }
}
