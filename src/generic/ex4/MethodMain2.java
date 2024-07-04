package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);


        AnimalMethod.<Dog>checkup(dog);
        //AnimalMethod.<Dog>checkup(dog); <>다이아몬드를 생략할 수 있다. 타입추론으로
        AnimalMethod.<Cat>checkup(cat);
        //AnimalMethod.<Cat>checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
