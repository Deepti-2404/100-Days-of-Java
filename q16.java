//DAY 4
//Write a program to create a basic calculator using a switch case.
import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System. in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division and 5 for remainder: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                double sum = num1 + num2;
                System.out.println("Sum is: " + sum);
                break;
            case 2:
                double difference = num1 - num2;
                System.out.println("Difference is: " + difference);
                break;
            case 3:
                double product = num1 * num2;
                System.out.println("Product is: " + product);
                break;
            case 4:
                double quotient = num1 / num2;
                System.out.println("Quotient is: " + quotient);
                break;
            case 5:
            double remainder = num1 % num2;
            System.out.println("Remainder is: " + remainder);
            break;
            default:
                System.out.println("Invalid choice");
        }   
    }
}