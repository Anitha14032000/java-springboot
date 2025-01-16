import java.util.*;

public class Order {
    private int orderId;
    private String orderDate;
    private List<String> orderedItems;
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderedItems = new ArrayList<>();
    }
    public void addItem(String item) {
        orderedItems.add(item);
    }
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Ordered Items: " + orderedItems);
    }
}









