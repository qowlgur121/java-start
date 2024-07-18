package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        /*
        내가 순회하고 싶은 멤버을 가진 클래스(MyArray)를 Iterable을 구현하면
        오버라이딩으로 iterator()을 구현하게 되고 이 메서드는 Iterator 인터페이스를 구현한 반복자(MyArrayIterator)를 반환한다.
        이것은 순회를 할 수 있게 하는 반복자라는 것이다.
        */
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        //추가
        System.out.println("for-each 사용");
        for (Integer value : myArray) {
            System.out.println("value = " + value);
        }

    }
}
