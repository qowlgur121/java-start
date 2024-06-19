package extends1.my;

public class ElectricCar extends Car{
    int batteryPerformance;


    public ElectricCar(String name, int fuel) {
        super(name, fuel);
    }

    public ElectricCar(String name, int fuel, int batteryPerformance) {
        super(name, fuel);
        this.batteryPerformance = batteryPerformance;
        System.out.println("전기차 준비 중!");
    }


    @Override
    public void fill() {
        System.out.println("전기를 충전합니다");
    }
}
