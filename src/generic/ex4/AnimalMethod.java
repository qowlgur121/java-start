package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {

    public static <T extends Animal> void checkup(T t) {
        // 메서드를 정의하는 시점에는 T의 타입을 알 수 있다. Animal 또는 자식이구나.
        // 그래서 Animal 기능을 쓸 수 있다.

        System.out.println("동물 이름: " + t.getName());
        System.out.println("동물 크기: " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T bigger(T t1, T t2) {

        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
