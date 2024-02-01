package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) { //부모는 자식을 담을 수 있다~ 거기다가 메서드 오버라이딩
        System.out.println("동물 소리 테스트 시작");
        animal.sound();  //각각의 기능을 메서드 오버라이딩으로 우선적 호출한 것임
        System.out.println("동물 소리 테스트 종료");
        System.out.println("-----------------");
    }
}
