import java.util.*;

public class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                products.remove(product);
                System.out.println(productName + " has been removed from the cart.");
                return;
            }
        }
        System.out.println("Product not found in the cart.");
    }
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getTotalPrice();
        }
        return totalPrice;
    }
    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Products in your cart:");
            for (Product product : products) {
                System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantity());
            }
        }
    }
}
