import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int numberOfCustomers = scanner.nextInt();

        for (int customer = 1; customer <= numberOfCustomers; customer++) {
            System.out.println("\n--- Customer " + customer + " ---");
            double totalBill = 0.0;

            while (true) {
                System.out.print("Enter the price of the item (or type 'done' to finish): ");
                String input = scanner.next();
                
                if (input.equalsIgnoreCase("done")) {
                    break;
                }

                try {
               
                    double itemPrice = Double.parseDouble(input);
                    totalBill += itemPrice;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid price or 'done' to finish.");
                }
            }

      
            System.out.println("Total Bill for Customer " + customer + ": $" + totalBill);
        }

        scanner.close();
    }
}





























