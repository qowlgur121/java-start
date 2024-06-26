package enumeration.ref3;

import enumeration.ref2.DiscountService;
import enumeration.ref2.Grade;

public class EnumRefMain3_1 {

    public static void main(String[] args) {
        int price = 10000;

        enumeration.ref2.DiscountService discountService = new DiscountService();

        int basic = discountService.discount(enumeration.ref2.Grade.BASIC, price);
        int gold = discountService.discount(enumeration.ref2.Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("basic 등급의 할인 금액: " + basic);
        System.out.println("gold 등급의 할인 금액: " + gold);
        System.out.println("diamond 등급의 할인 금액: " + diamond);
    }
}
