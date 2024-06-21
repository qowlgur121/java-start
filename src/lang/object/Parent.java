package lang.object;

/*
모든 클래스의 최상위 클래스는 Object라서  extends Object을 해야한다.
하지만 너무 당연한 것이기 때문에 컴파일러가 알아서 extends를 해주기 때문에 생략가능

 */

public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
