import java.util.Arrays;

public class Workshop {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reversed String (StringBuilder): " + reverseString(str));
        System.out.println("Reversed String (Loop): " + reverseStringLoop(str));
        System.out.println("Reversed String (CharArray): " + reverseStringCharArray(str));

        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + isAnagram(str1, str2));
    }

    // Method to reverse a string using StringBuilder
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Method to reverse a string using a loop
    public static String reverseStringLoop(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Method to reverse a string using a character array
    public static String reverseStringCharArray(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
