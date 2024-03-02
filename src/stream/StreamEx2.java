package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 5, 4, 2);
        List<Integer> sortedList = list.stream().sorted() //list를 정렬해서
                .collect(Collectors.toList());            //새로운 list에 저장
        System.out.println(list);           // [3, 1, 5, 4, 2]
        System.out.println(sortedList);     // [1, 2, 3, 4, 5]

        Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        int sum = strStream.parallel() // 병령 스트림으로 전환(속성만 변경)
                .mapToInt(s -> s.length()).sum(); // 모든 문자열의 길이의 합
    }
}


