package extends1.my;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("아이오닉", 80, 98);
        electricCar.fill();

        OilCar oilCar = new OilCar("쏘나타", 99);
        oilCar.fill();
    }
}
