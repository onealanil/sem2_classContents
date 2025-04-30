package Revision;

//2. Write a Java method that takes a string and counts how many vowels (a, e, i, o, u) are present in
// it.

public class Q2 {
    public static void main(String[] args) {
        String str = "Hello world";
        int count = countVowels(str);
        System.out.println("Number of vowels in the string: " + count);
    }

    public static int countVowels(String str) {
        int vowelCount = 0;
        for (char c : str.toCharArray()) {
          if ("aeiouAEIOU".indexOf(c) != -1) {
              vowelCount++;
          }
        }
        return vowelCount;
    }
}
