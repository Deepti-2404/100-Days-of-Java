// DAY 4
//Convert temperature between Celsius and Fahrenheit using a switch case.
import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System. in);
        System.out.println("Enter the temperature in Celsius: ");
        double Celsius = sc.nextDouble();
        System.out.println("Enter 1 to convert to Fahrenheit and 2 to convert to Celsius: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                double Fahrenheit = (Celsius * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
                break;
                case 2:
                    double newCelsius = (Celsius - 32) * 5/9;
                    System.out.println("Temperature in Celsius is: " + newCelsius);
                    break;
                default:
                System.out.println("Invalid choice");
        }
    }
}
