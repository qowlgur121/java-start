package collection.set.test;

/*

여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라. -> 셋?
30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
단 입력 순서대로 출력해라.
출력 예): -> 입력순이네? 링크드해시셋
30
20
10
 */

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new LinkedHashSet<>();

        for (Integer s : set) {
            System.out.println(s);
        }

    }
}
