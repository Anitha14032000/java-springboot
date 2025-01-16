import java.util.Scanner;

public class RestaurantMenuOrdering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] menuItems = {"Pizza", "Burger", "Pasta", "Salad", "Soda"};
        double[] prices = {8.99, 5.99, 7.49, 4.99, 1.99};


        StringBuilder orderDetails = new StringBuilder();
        double totalCost = 0.0;

        System.out.println("--- Restaurant Menu ---");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i] + " - $" + prices[i]);
        }
        while (true) {
            System.out.print("\nEnter the number of the item you want to order (1-5), or 'done' to finish: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break; 
            }

            try {
                int choice = Integer.parseInt(input);

                if (choice >= 1 && choice <= menuItems.length) {

                    orderDetails.append(menuItems[choice - 1]).append(" - $").append(prices[choice - 1]).append("\n");
                    totalCost += prices[choice - 1];
                } else {
                    System.out.println("Invalid choice! Please select a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'done' to finish.");
            }
        }
        System.out.println("\n--- Your Order ---");
        System.out.println(orderDetails.toString());
        System.out.println("Total Cost: $" + totalCost);

        scanner.close();
    }
}











