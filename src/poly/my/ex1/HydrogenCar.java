package poly.my.ex1;

public class HydrogenCar extends Car implements Fuel {

    @Override
    public void sound() {
        System.out.println("줄줄");
    }
    @Override
    public void fillUp() {
        System.out.println("수소 충전합니다");
    }
}
