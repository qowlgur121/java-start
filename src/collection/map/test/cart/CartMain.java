package collection.map.test.cart;


/*

==모든 상품 출력==
상품: Product{name='사과', price=1000} 수량: 1
상품: Product{name='바나나', price=500} 수량: 1
==모든 상품 출력==
상품: Product{name='사과', price=1000} 수량: 3
상품: Product{name='바나나', price=500} 수량: 1
==모든 상품 출력==
상품: Product{name='바나나', price=500} 수량: 1
 */
public class CartMain {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("사과", 1000), 1);
        cart.add(new Product("바나나", 500), 1);
        cart.printAll();
        /*
        ==모든 상품 출력==
        상품: Product{name='사과', price=1000} 수량: 1
        상품: Product{name='바나나', price=500} 수량: 1
         */

        cart.add(new Product("사과", 1000), 2);
        cart.printAll();
        /*
        ==모든 상품 출력==
        상품: Product{name='사과', price=1000} 수량: 3
        상품: Product{name='바나나', price=500} 수량: 1
         */

        cart.minus(new Product("사과", 1000), 3);
        cart.printAll();
        /*
        ==모든 상품 출력==
        상품: Product{name='바나나', price=500} 수량: 1
         */
    }
}
