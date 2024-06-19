package poly.my.ex;

public class GasCar extends Car implements Fuel{
    @Override
    public void sound() {
        System.out.println("부릉");
    }

    @Override
    public void fillUp() {
        System.out.println("기름 넣습니다");
    }
}
