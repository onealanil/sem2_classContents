package content;

// % start of a format specifier
// % - left justify
// % 20 - width of the field

public class StringFromat {
    public static void main(String[] args) {
        //It repeats the string 50 times
        System.out.println("-".repeat(50));
        String heading = String.format("|%-20s|%2s|%3s|%4s|", "Id", "Name", "Section", "Batch");
        System.out.println(heading);
    }
}
