package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        //이거 문제가 있다. 나는 Integer을 넣었을 때 똑같은 타입으로 받고
        // 그 기능을 쓰고 싶은데 그럴려면 Integer로 형변환해야 한다.
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        // 타입 추론으로 제네릭 타입 생략 가능
        System.out.println("타입 추론");
        Integer result1 = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.<Double>numberMethod(20.0);
    }
}
