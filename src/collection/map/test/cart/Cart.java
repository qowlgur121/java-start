package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int addQuantity) {

/*
        if (cartMap.containsKey(product)) {
            int newNumber = cartMap.get(product) + addQuantity;
            cartMap.put(product, newNumber);
            return;
        }
        cartMap.put(product, addQuantity);
*/

        //키인 product의 값이 존재하지 않으면 0을 반환, 존재하면 값을 반환
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + addQuantity);
    }

    public void minus(Product product, int minusQuantity) {
        //키인 product의 값이 존재하지 않으면 0을 반환, 존재하면 값을 반환
        int existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - minusQuantity;

        if (newQuantity <= 0) {
            cartMap.remove(product);
            return;
        }

        cartMap.put(product, newQuantity);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
/*
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cartMap.get(product));
        }
*/
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }

}
