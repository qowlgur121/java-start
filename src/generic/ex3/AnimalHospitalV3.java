package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> { //T는 Animal이거나 그 자식이어야 함

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // 메서드를 정의하는 시점에는 T의 타입을 알 수 있다. Animal 또는 자식이구나.
        // 그래서 Animal 기능을 쓸 수 있다.

        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {

        return animal.getSize() > target.getSize() ? animal : target;
    }
}
