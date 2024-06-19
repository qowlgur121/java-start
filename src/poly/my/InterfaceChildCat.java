package poly.my;

public class InterfaceChildCat implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("이동합니다");
    }
}
