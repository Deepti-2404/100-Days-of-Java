// DAY 3
//Write a program to display the multiplication table of a given number.
import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for ( int i = 1; i <= 10; i++) {
            System.out.print("Multiplication table of " + n + " is:  ");
            System.err.println(n + " * " + i + " = " + n*i);
        }
    }
}
