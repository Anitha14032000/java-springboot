import java.util.Scanner;

public class temConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

