package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
/*
        ClassGrade newClassGrade = new ClassGrade();
        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);
*/

        /*
        해당 클래스의 문제는 ClassGrade를 따로 인스턴스화해서 discount로 넘겨버리면 참조값으로 비교하는
        if문에서 제대로 작동 안한다.
        if (classGrade == ClassGrade.BASIC) { 이런 형태에서 서로의 참조값이 달라져버린다
        원인은 인스턴스화를 잘못해서 그런거니까 생성자를 private로 해서 객체 생성을 막자
         */
    }
}
