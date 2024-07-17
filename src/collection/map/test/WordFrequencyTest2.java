package collection.map.test;

/*
각각의 단어가 나타난 수를 출력해라

실행 결과
```
{orange=1, banana=2, apple=3}
 */

import java.util.HashMap;

public class WordFrequencyTest2 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 코드 작성
        /*
        일단 배열을 잘라야 한다. 단어 단위로 split을 쓰자
         */

        String[] words = text.split("");

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer count = map.getOrDefault(word, 0); //word가 없으면 0을 반환하고 있으면 값을 반환하는
            map.put(word, count);
        }
    }
}
