package poly.my.ex2;

// 차량이 추가되더라도 클래스 코드를 변경하지 않아도 된다
public class Driver {
    private Car car;
    private Driver(){};

    public Driver(Car car) {
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void drive() {
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
