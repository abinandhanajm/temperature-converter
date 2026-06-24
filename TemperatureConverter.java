import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        double result;

        if (choice == 1) {
            result = (temp * 9/5) + 32;
            System.out.println("Fahrenheit = " + result);
        } 
        else if (choice == 2) {
            result = (temp - 32) * 5/9;
            System.out.println("Celsius = " + result);
        } 
        else {
            System.out.println("Invalid choice");
        }
    }
}