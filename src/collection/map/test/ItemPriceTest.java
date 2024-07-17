package collection.map.test;

import java.util.*;

/*
다음 예제에서 Map 에 들어있는 데이터 중에 값이 1000원인 모든 상품을 출력해라.
실행 결과를 참고하자.

실행 결과
```
[망고, 딸기]
 */
public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        // 코드 작성 내꺼
        /*Set<String> keySet = map.keySet();
        System.out.print("[");

        boolean isFirst = true;
        for (String key : keySet) {
            if (map.get(key) == 1000) {
                if (!isFirst) {
                    System.out.print(", " + key);
                } else {
                    System.out.print(key);
                }
                isFirst = false;
            }
        }
        System.out.print("]");
*/
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1000)) {
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
    }
}
