package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter(); //x001
        //인스턴스 내부 클래스 객체를 생성하려면 먼저 외부 클래스 객체가 존재해야 한다.
        InnerOuter.Inner inner = outer.new Inner(); //x001.new Inner() 즉, x001 내부에 Inner 만들어라는 뜻
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
