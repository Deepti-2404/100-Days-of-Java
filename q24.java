//Day 5
//Implement a function that finds the greatest of three number
import java.util.Scanner;
public class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        int greatest = greatestOfThree(num1, num2, num3);
        System.out.println("The greatest number is " + greatest);
        sc.close();
    }

    public static int greatestOfThree(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
