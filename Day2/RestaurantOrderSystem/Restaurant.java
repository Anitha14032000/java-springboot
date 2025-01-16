import java.util.*;

public class Restaurant {
    private List<MenuItem> menu;
    private List<MenuItem> orders;

    public Restaurant() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
    }

    public void displayMenu() {
        System.out.println("Restaurant Menu:");
        for (MenuItem item : menu) {
            item.displayItem();
        }
        System.out.println();
    }
    public void takeOrder(String itemName) {
        for (MenuItem item : menu) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                orders.add(item);
                System.out.println(itemName + " has been added to your order.");
                return;
            }
        }
        System.out.println("Item not found in the menu.");
    }
    public double calculateTotalBill() {
        double totalBill = 0;
        for (MenuItem item : orders) {
            totalBill += item.getItemPrice();
        }
        return totalBill;
    }

    public void displayBill() {
        System.out.println("\nYour Order:");
        for (MenuItem item : orders) {
            System.out.println(item.getItemName() + " - $" + item.getItemPrice());
        }
        double totalBill = calculateTotalBill();
        System.out.println("\nTotal Bill: $" + totalBill);
    }
}



