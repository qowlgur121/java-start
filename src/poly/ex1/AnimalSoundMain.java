package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("동물 소리 테스트 시작"); //코드가 계속 반복된다..
        dog.sound();
        System.out.println("동물 소리 테스트 종류");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종류");

        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종류");

        soundCaw(caw);  //함수를 만들어도 타입이 달라서 효과가 없다..
    }

    private static void soundCaw(Caw caw) {
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종류");
    }


}
