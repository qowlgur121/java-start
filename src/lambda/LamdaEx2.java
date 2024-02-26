package lambda;

public class LamdaEx2 {
    public static void main(String[] args) {

        Calculable calculable = ((a , b) -> {
            System.out.println(a + b);
        }); //람다는 함수형 인터페이스(추상 메서드가 딱 1개만 있는 인터페이스)의 구현 객체를 한줄로 만드는 방법.

        calculable.addTwoNumbers(1, 2);
    }
}
