package extends1.my;

public class Car {
    String name;
    int fuel;

    public Car(String name, int fuel) {
        System.out.println(name + " 준비 중, 연료 상황:" + fuel);
    }

    public void openDoor() {
        System.out.println("문을 엽니다");
    }

    public void accel() {
        System.out.println("가속합니다");
    }

    public void fill() {
        System.out.println("연료를 넣습니다");
    }
}
