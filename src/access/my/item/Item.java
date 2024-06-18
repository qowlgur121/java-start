package access.my.item;

public class Item {
    private String name;
    private int price;
    private int quantity;

    private static int itemQuantity = 0;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        itemQuantity++;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static int getItemQuantity() {
        return itemQuantity;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
