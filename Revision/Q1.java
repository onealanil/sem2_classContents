package Revision;

import java.util.Scanner;

//1. Write a Java program to take two strings as input, compare them, and check if they are equal
// (ignoring case). Also, display both strings in uppercase and lowercase.
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        //comapre the strings
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Both strings are equal (ignoring case).");
        } else {
            System.out.println("Strings are not equal.");
        }

        //display both strings in uppercase and lowercase
        System.out.println("String 1 in uppercase: " + str1.toUpperCase());
        System.out.println("String 1 in lowercase: " + str1.toLowerCase());
        System.out.println("String 2 in uppercase: " + str2.toUpperCase());
        System.out.println("String 2 in lowercase: " + str2.toLowerCase());
        //close the scanner
        sc.close();
    }
}
