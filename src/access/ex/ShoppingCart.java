package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (isItemValid()) {
            items[itemCount] = item;
            itemCount++;
            return;
        }
        System.out.println("장바구니가 가득 찼습니다.");
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalAmount = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i]; //일단 변수에 담자. 코드가 깔끔해지게
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice()); //합계 함수를 따로 만들었다. 왜냐하면 item에 대한 계산이기에 그쪽 클래스에 함수를 만드는게 좋다.
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice()); //총가격합을 함수를 따로 만듬
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

    private boolean isItemValid() {
        return itemCount < items.length ;
    }
}
