package StringFormat;

// % start of a format specifier
// - left justify
// 20s - width of the field
public class StringFormatDemo {
    public static void main(String[] args) {
        //It repeats the string 50 times
        System.out.println("-".repeat(50));
        String heading = String.format("|%-20s|%-20s|", "Id", "Name");
        System.out.println(heading);
        System.out.println("-".repeat(50));
        String s1 = String.format("|%-20s|%-20s|", "1", "Ricky");
        System.out.println(s1);
        String s2 = String.format("|%-20s|%-20s|", "2", "Snow");
        System.out.println(s2);
       
    }
}
