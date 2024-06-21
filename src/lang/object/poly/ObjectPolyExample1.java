package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    public static void action(Object obj) {
        //obj.sound(); //컴파일 오류가 난다. Object에는 저 함수가 없기 때문...실행하려면 다운캐스팅이 필요. 그걸 instanceof를 이용해서 해보자
        //obj.move(); //컴파일 오류.
        if (obj instanceof Dog dog) {
            //만약 obj의 인스턴스타입이 Dog이면 조건식이 true이고Dog dog = (Dog) obj; 자동으로 캐스팅된것임
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
