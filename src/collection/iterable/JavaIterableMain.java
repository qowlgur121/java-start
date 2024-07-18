package collection.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); //list는 Interable 인터페이스를 구현한 객체->향상된 for문을 사용할 수 있다.
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>(); //set는 Interable 인터페이스를 구현한 객체->향상된 for문을 사용할 수 있다.
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(list.iterator());
        printAll(set.iterator());

        foreach(list);
        foreach(set);

    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void foreach(Iterable<Integer> iterable) {
        //향상된 for문을 사용하려면 Itarable이 구현되어 있어야 한다. 그래서 재사용성을 높이기 위해 Iterable로 받으면 된다.
        System.out.println("iterable = " + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }
}
