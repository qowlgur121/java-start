package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public String getName() {
        return name;
    }

    public int getTotalPrice() { //item필드의 계산은 같은 클래스에서 해주는 게 가장 좋다. 객체지향적
        return price * quantity;
    }

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


}
