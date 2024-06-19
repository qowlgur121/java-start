package poly.my.ex1;

public class ElectricCar extends Car implements Fuel{
    @Override
    public void sound() {
        System.out.println("위잉");
    }

    @Override
    public void fillUp() {
        System.out.println("전기를 충전합니다");
    }
}
