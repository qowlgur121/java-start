package poly.my.ex1;


public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();
        HydrogenCar hydrogenCar = new HydrogenCar();

        move(gasCar);
        fillUp(gasCar);

        move(electricCar);
        fillUp(electricCar);

        move(hydrogenCar);
        fillUp(hydrogenCar);

    }
    private static void move(Car car) {
        car.sound();
    }

    private static void fillUp(Fuel car) {
        car.fillUp();
    }
}
