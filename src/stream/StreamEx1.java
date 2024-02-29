package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Durian", "Elderberry");

        List<String> longWords = words.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());

        System.out.println(longWords); // 출력: [Banana, Cherry, Durian, Elderberry]
    }
}