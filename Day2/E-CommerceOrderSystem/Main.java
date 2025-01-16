import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter Customer Address: ");
        String customerAddress = scanner.nextLine();

        Customer customer = new Customer(customerId, customerName, customerAddress);
        System.out.print("Enter Order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Order Date (YYYY-MM-DD): ");
        String orderDate = scanner.nextLine();
        Order order = new Order(orderId, orderDate);
        while (true) {
            System.out.print("Enter item to add to the order (or type 'done' to finish): ");
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("done")) {
                break;
            }
            order.addItem(item);
        }
        System.out.println("\n--- Customer Details ---");
        customer.displayCustomerDetails();
        System.out.println("\n--- Order Details ---");
        order.displayOrderDetails();

        scanner.close();
    }
}






