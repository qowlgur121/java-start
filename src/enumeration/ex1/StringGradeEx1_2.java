package enumeration.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 소문자 입력
        int basic = discountService.discount("basic", price);
        System.out.println("basic 등급의 할인 금액: " + basic);

        // 오타
        int ggold = discountService.discount("GGOLD", price);
        System.out.println("GGOLD 등급의 할인 금액: " + ggold);

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);
    }
}
