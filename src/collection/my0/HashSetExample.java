package collection.my0;

import access.Speaker;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("java");
        set.add("JDBC");
        set.add("Java");
        set.add("JSP");
        set.add("Spring");

        int size = set.size();
        System.out.println("총 객체 수: " + size);
    }
}
