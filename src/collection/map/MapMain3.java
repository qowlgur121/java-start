package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("배지혁", 10);
        System.out.println(studentMap);

        if (!studentMap.containsKey("배지혁")) {
            studentMap.put("배지혁", 20);
        }
        System.out.println("studentMap = " + studentMap);

        studentMap.putIfAbsent("배지혁", 20);
        System.out.println("studentMap = " + studentMap);
        studentMap.putIfAbsent("이윤진", 30);
        System.out.println("studentMap = " + studentMap);
    }
}
