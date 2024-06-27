package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        ////중첩 클래스는 바깥 클래스의 인스턴스를 생성안해도 상관없다.
        //NestedOuter nestedOuter = new NestedOuter();

        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();
        System.out.println("nestedClass = " + nested.getClass());
    }


}
