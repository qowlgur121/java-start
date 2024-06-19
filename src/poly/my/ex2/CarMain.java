package poly.my.ex2;


public class CarMain {
    public static void main(String[] args) {
        Car k3Car = new K3Car();
        Driver driver1 = new Driver(k3Car);
        driver1.drive();

        Car model3Car = new Model3Car();
        driver1.setCar(model3Car);
        driver1.drive();
    }
}
