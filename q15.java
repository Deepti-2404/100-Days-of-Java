//DAY 3
//Reverse a number using a loop (e.g., 123 → 321).
import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int reverse = 0;
        while (n!=0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        System.out.println("Reversed number: " + reverse);
    }
}
