package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(); //이렇게 하면 내부 클래스Engine은 자신을 생성한 바깥의 Car 인스턴스를 자동으로 참조한다.
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {
        // 내부 클래스는 바깥 클래스의 멤버(변수, 메서드)에 접근할 수 있다.
        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
