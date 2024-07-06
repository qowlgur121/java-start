package collection.my0;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("key1", 100);
        map.put("key2", 200);
        map.put("key3", 300);

        System.out.println(map);    // {key1=100, key2=200, key3=300}
        System.out.println(map.get("key1"));    // 100
        System.out.println(map.get("key2"));    // 200
        System.out.println(map.get("key2"));    // 300

        if (!map.containsKey("key2")) {     // 키가 들어있는지 확인, 있으면 덮어쓰지 않는다.
            map.put("key2", 300);
        }
        System.out.println(map.get("key2"));    // 200

        System.out.println("모든 Key-Value 조회");
        for (String key : map.keySet()) {
            System.out.println("{" + key + "," + map.get(key) + "}");
        }
        /*결과*/
        // 모든 Key-Value 조회
        // {key1,100}
        // {key2,200}
        // {key3,300}

        // forEach문 사용으로 조회
        map.forEach((key, value) ->
                {
                    System.out.println("{" + key + "," + map.get(key) + "}");
                }
        );
        // {key1,100}
        // {key2,100}
        // {key3,100}

        /* replace를 이용하여 수정 */
        map.replace("key2", 400);
        System.out.println("key2 =" + map.get("key2"));
        // 400

        /* remove 제거 */
        map.remove("key1");

        /* 맵의 크기 */
        System.out.println("map size = " + map.size());
        // 2
    }
}
