//DAY 3
//Check if a number is prime.
import java.util.Scanner;
public class q14 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if ( n == 1 ) {
            System.out.println(n + " is neither prime nor composite.");
        }
        else if (n == 2) {
            System.out.println(n + " is a prime number.");
        }
        else if (n % 2 == 0) {
            System.out.println(n + " is not a prime number.");
        }
        else {
            System.out.println(n + " is a prime number.");
        }
        }
    }
