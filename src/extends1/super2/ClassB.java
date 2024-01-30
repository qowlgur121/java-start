package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        //this(a, 10);가 먼저 올 수 있다. 이건 자기 자신의 생성자를 호출하는 것.
        //super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        //super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a + ", b=" + b);
    }
}
