package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    /**
     * set = class java.util.HashSet //HashSet은 순서가 없으니 뒤죽박죽
     * A 1 B 2 C
     * set = class java.util.LinkedHashSet //입력한 순서를 정확히 보장한다.
     * C B A 1 2
     * set = class java.util.TreeSet //데이터 값을 기준으로 정렬한다.
     * 1 2 A B C
     */
}
