//Determine if a given number is positive, negative, or zero.
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      if (num%2==0) {
        System.out.println(num + " is even.");
      } 
      else if (num == 0) {
        System.out.println(num + " is zero.");
      }
      else {
        System.out.println(num + " is odd.");
      }
    }
}
