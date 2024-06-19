package poly.my;

public class AnimalSoundMain {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();

        Animal[] animals = {dog, cat, caw};

        //Animal animal = new Animal(); //추상 클래스의 인스턴스는 생성하지 못한다

        for (Animal animal : animals) {
            soundAnimal(animal);
        }

        System.out.println(InterfaceAnimal.PI);

        InterfaceAnimal animal = new InterfaceChildCat();
        cat.sound();
        cat.move();
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
