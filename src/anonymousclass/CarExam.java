package anonymousclass;

import com.sun.jdi.PathSearchingVirtualMachine;
import poly.test.B;
import poly.test.C;

public class CarExam {
    public static void main(String[] args) {
        Car c1 = new Car(){ //이름 없는 객체
            @Override
            public void a() {
                System.out.println("이름없는 객체의 a()메소드 오버라이딩");
            }
        };

        c1.a();

        Car c2 = new Bus();

    }
}
