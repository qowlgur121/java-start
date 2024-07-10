package collection.list.test.ex2;

public class ShoppingCartMain {

    /**
     * 장바구니 상품 출력
     * 상품명:마늘, 합계:4000
     * 상품명:상추, 합계:12000
     * 전체 가격 합:16000
     */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
