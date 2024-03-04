package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // 1. 글자 수가 5 이상인 단어만 필터링하여 새로운 리스트 생성
        List<String> longWords = words.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("Long words: " + longWords);

        // 2. 각 단어를 대문자로 변환하여 새로운 리스트 생성
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase words: " + uppercaseWords);

        // 3. 특정 문자열을 포함하는 단어만 필터링하여 새로운 리스트 생성
        String searchTerm = "a";
        List<String> wordsWithSearchTerm = words.stream()
                .filter(word -> word.contains(searchTerm))
                .collect(Collectors.toList());
        System.out.println("Words with search term '" + searchTerm + "': " + wordsWithSearchTerm);
    }
}
