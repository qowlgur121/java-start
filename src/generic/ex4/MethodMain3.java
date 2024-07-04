package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);

        /**
         * animal.className: generic.animal.Dog
         * t.clasName: generic.animal.Cat
         * returnCat = Animal{name='냐옹이', size=50}
         */

        //즉 제네릭 타입과 제네릭 메서드는 다르다.
    }
}
