//Write a program to check if a number is even or odd using the modulus operator.
public class q3 {
    public static void main(String[] args) {
        int num = 50;
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}