//Find the greatest among three numbers using if-else statements.
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.println("Please! Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c) {
            System.out.println("The greatest number is: " + a);
        }
        else if (b>a && b>c) {
            System.out.println("The greatest number is: " + b);
        }
        else {
            System.out.println("The greatest number is: " + c);
        }
    }
    
}
