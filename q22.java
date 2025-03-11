//Day 5
//Create a function to check if a number is even or odd.
import java.util.Scanner;
public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (isEven(num)) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
                }
                sc.close();
            }
        
            public static boolean isEven(int num) {
                return num % 2 == 0;
            }
        }
