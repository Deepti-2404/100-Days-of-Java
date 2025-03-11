// Day 5
//Write a function to find the factorial of a number.
import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        long factorial = factorial(num);
        System.out.println("Factorial of " + num + " is " + factorial);
        sc.close();
    }

    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
