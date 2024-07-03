package generic.ex1;

/**
 * 이 케이스는 각각의 타입별로 클래스를 모두 정의해서
 * 코드 재사용성X
 * 타입 안정성O
 */
public class BoxMain {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
