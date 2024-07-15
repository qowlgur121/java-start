package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("배지혁", 10);
        studentMap.put("배지혁", 20);
        System.out.println(studentMap);

        boolean result = studentMap.containsKey("배지혁");
        System.out.println("result = " + result);

        studentMap.remove("배지혁");
        System.out.println("studentMap = " + studentMap);
    }
}
