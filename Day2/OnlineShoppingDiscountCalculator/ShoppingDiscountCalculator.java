import java.util.Scanner;

public class ShoppingDiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total price of items in your cart: $");
        double totalPrice = scanner.nextDouble();

        double discount = 0.0;

        if (totalPrice > 500) {
            discount = totalPrice * 0.10; 
        } else if (totalPrice >= 200 && totalPrice <= 500) {
            discount = totalPrice * 0.05; 
        } else {
            discount = 0.0; 
        }

        double finalPrice = totalPrice - discount;
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Final Price to Pay: $" + finalPrice);

        scanner.close();
    }
}






