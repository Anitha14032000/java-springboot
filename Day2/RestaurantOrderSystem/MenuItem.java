public class MenuItem {
    private String itemName;
    private double itemPrice;
    private String itemCategory;
    public MenuItem(String itemName, double itemPrice, String itemCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
    }
    public String getItemName() {
        return itemName;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public String getItemCategory() {
        return itemCategory;
    }
    public void displayItem() {
        System.out.println(itemName + " (" + itemCategory + ") - $" + itemPrice);
    }
}
