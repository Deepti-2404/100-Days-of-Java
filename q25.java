//Day 5
//Write a function that takes a string as input and returns the reversed string
import java.util.Scanner;
public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String reversed = reverseString(str);
        System.out.println("The reversed string is " + reversed);
        sc.close();
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}