package access.my.shoppingCart;

import access.my.item.Item;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        items[itemCount++] = item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        /*

        //이거 위험하다. 왜냐하면 items의 크기가 10인데 실제 안들어간 8개 공간도 다 순회한다.
        for (Item item : items) {
            System.out.println("상품명:" + item.getName() +
                    ", 합계:" + item.getPrice() * item.getQuantity());
        } // item.getPrice() * item.getQuantity() 이거는 Item에다가 getTotalPrice를 만들자

         */
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명:" + items[i].getName() +
                    ", 합계:" + items[i].getTotalPrice());
        }

        System.out.println("전체 가격 합:" + calculateTotalPrice());

        System.out.println("상품 수:" + Item.getItemQuantity());
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }
}

