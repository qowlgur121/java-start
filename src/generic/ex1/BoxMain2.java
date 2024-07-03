package generic.ex1;

/**
 * 이 케이스는 Object를 사용해서 다형성으로 하나의 클래스만 정의해서
 * 코드 재사용성O
 * 타입 안정성X
 */
public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //Object -> Integer 캐스팅
        System.out.println("integer = " + integer); //내부적으로 System.out.println(integer.toString());과 동일

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Object -> String 캐스팅
        System.out.println("string = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        //integerBox에 Integer가 들어가 있을 줄 알고 다운 캐스팅 했는데 사실 안에는 String이 들어가 있어서 String -> Int...
        //그리고 이런건 컴파일러가 못 잡는다. 결국 런타임 오류가 뜬다.
        //Integer result = (Integer) integerBox.get(); //String -> Integer 캐스팅 예외
    }
}