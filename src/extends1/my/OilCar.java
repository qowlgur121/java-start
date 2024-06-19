package extends1.my;

public class OilCar extends Car{

    public OilCar(String name, int fuel) {
        super(name, fuel);
        System.out.println("기름차 준비중");
    }

    @Override
    public void fill() {
        System.out.println("기름 넣습니다");
    }
}
