import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(new MenuItem("Pizza", 12.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Pasta", 10.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Salad", 5.99, "Appetizer"));
        restaurant.addMenuItem(new MenuItem("Soda", 1.99, "Beverage"));
        restaurant.addMenuItem(new MenuItem("Ice Cream", 3.99, "Dessert"));

        restaurant.displayMenu();

        Scanner scanner = new Scanner(System.in);
        String customerChoice;
        while (true) {
            System.out.print("Enter an item name to order (or type 'done' to finish): ");
            customerChoice = scanner.nextLine();

            if (customerChoice.equalsIgnoreCase("done")) {
                break;
            } else {
                restaurant.takeOrder(customerChoice);
            }
        }

        restaurant.displayBill();
    }
}









