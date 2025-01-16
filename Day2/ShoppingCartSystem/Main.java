public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();

        Product product1 = new Product("Laptop", 1000.0, 2);
        Product product2 = new Product("Smartphone", 500.0, 3);
        Product product3 = new Product("Headphones", 100.0, 1);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        cart.displayCart();
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: " + totalPrice);
        cart.removeProduct("Smartphone");
        cart.displayCart();
        totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price after removal: " + totalPrice);
    }
}








