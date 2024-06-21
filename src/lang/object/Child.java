package lang.object;

/*
클래스가 아무것도 상속하지 않고 있으면 extends Object가 묵시적으로 되고 있지만
부모가 Object를 상속하고 있기 때문에 Child는 Object를 상속하고 있는것과 마찬가지기 때문
이 클래스는 Parent를 상속하고 있기 때문에 Object를 따로 명시적으로 상속할 필요가 없다
 */
public class Child extends Parent{
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
