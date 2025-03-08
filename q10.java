// Write a Java program to check if a character is a vowel or consonant.

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a character: ");
        String ch = sc.next();
        if (ch.length() > 1) {
            System.out.println("Please! Enter a single character.");
        }
        else {
            if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u") || ch.equals("A") || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U")) {
                System.out.println(ch + " is a vowel.");
            }
            else {
                System.out.println(ch + " is a consonant.");
            }
        }
    }
}