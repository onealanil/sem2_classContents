import java.util.Arrays;

public class Tutorial {
    public static void main(String[] args) {

        String s = "hell";
        String s1 = "hello";
        System.out.println(s1.compareTo(s)); // Output: 1 (difference between 'o' and null)

        int nUnicode = (int) 'n';
        int oUnicode = (int) 'o';
        System.out.println(nUnicode); // Output: 110
        System.out.println(oUnicode); // Output: 111

        /*** Defining the Strings ************** */
        String x = "Amil";
        String y = new String("Anil");
        System.out.println(x.compareTo(y)); // Compare lexicographically

        /********** Breaking string to charArray() **********/
        char[] name = x.toCharArray();
        for (char c : name) {
            System.out.println(c);
        }

        /************ Create char array to string ************ */
        String name1 = new String(name);
        System.out.println(name1.getClass().getSimpleName()); // Output: String

        /*********** Concatenation ***************/
        // Using '+' operator
        String z = "Anil";
        z = z + " Bhandari";
        System.out.println(z); // Output: Anil Bhandari

        // Using concat() method
        String zx = "Anil";
        zx = zx.concat(" Bhandari");
        System.out.println("This is zx: " + zx);

        /*********** String comparison ***************/
        // Using '==' operator
        String a1 = "Hello";
        String a2 = "Hello";
        System.out.println(a1 == a2); // Output: true (same memory reference)

        // Using equals() method
        String b1 = new String("Hello");
        System.out.println(a1.equals(b1)); // Output: true

        // Using equalsIgnoreCase() method
        String c1 = "HELLO";
        System.out.println(a1.equalsIgnoreCase(c1)); // Output: true

        // Using compareTo() method
        System.out.println(a1.compareTo(b1)); // Output: 0 (same strings)

        /************** Substring in Java *************** */
        String namee = "Anil";
        System.out.println(namee.substring(2)); // Output: il

        /************** String length in Java *************** */
        String name2 = "Anil";
        System.out.println(name2.length()); // Output: 4

        // charAt() method
        System.out.println(name2.charAt(1)); // Output: n

        /************** String toLowerCase() and toUpperCase() in Java *************** */
        System.out.println(name2.toLowerCase()); // Output: anil
        System.out.println(name2.toUpperCase()); // Output: ANIL

        /************** String trim() in Java *************** */
        String z1 = "           Anil             ";
        System.out.println(z1.trim()); // Output: "Anil"

        /************** String replace() in Java *************** */
        String rep = "abbabbacc";
        String replaced = rep.replace('b', 'x');
        System.out.println(replaced); // Output: axxaxxacc

        /************** String split() in Java *************** */
        String sp = "Anil-Bhandari";
        String[] sp1 = sp.split("-");
        System.out.println(Arrays.toString(sp1)); // Output: [Anil, Bhandari]

        /*************** indexOf() method ***************/
        System.out.println(rep.indexOf('b')); // Output: 1 (first occurrence)

        /******************* contains() method ***************/
        System.out.println(rep.contains("abb")); // Output: true

        /******************* getChars() ***************/
        String name3 = "Anilbhandari";
        char[] name3_char = new char[6];
        name3.getChars(0, 5, name3_char, 0);
        System.out.println(Arrays.toString(name3_char)); // Output: [A, n, i, l, b, h]

        /******************** Breaking strings to char ******************** */
        char[] charArray = name3.toCharArray();
        System.out.println(Arrays.toString(charArray));

        /**************** Testing String and StringBuilder Performance ********************/
        int iterations = 100000;
        
        // ==================== String =============================
        long startTime1 = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str = str + i;
        }
        long endTime1 = System.nanoTime();
        System.out.println("String Execution Time: " + (endTime1 - startTime1) / 1_000_000 + " ms");

        // ===================== StringBuilder =========================
        long startTime2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(i);
        }
        long endTime2 = System.nanoTime();
        System.out.println("StringBuilder Execution Time: " + (endTime2 - startTime2) / 1_000_000 + " ms");
    }
}
