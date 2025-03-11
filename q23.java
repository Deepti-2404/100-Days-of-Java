//Day 5
//Write a function to calculate the power of a number without using Math.pow()
import java.util.Scanner;
public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int expoonent = sc.nextInt();
        long result = power(base, expoonent);
        System.out.println(base + " raised to the power of " + expoonent + " is " + result);
        sc.close();
    }

    public static long power(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
