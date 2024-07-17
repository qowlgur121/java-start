package collection.map.test;

import java.util.HashMap;
import java.util.Scanner;

/*
영어 단어를 입력하면 한글 단어를 찾아주는 영어 사전을 만들자.
먼저 영어 단어와 한글 단어를 사전에 저장하는 단계를 거친다.
이후에 단어를 검색한다.
실행 결과를 참고하자

실행 결과
```
==단어 입력 단계==
영어 단어를 입력하세요 (종료는 'q'): apple 
한글 뜻을 입력하세요: 사과
영어 단어를 입력하세요 (종료는 'q'): banana 
한글 뜻을 입력하세요: 바나나
영어 단어를 입력하세요 (종료는 'q'): q

==단어 검색 단계==
찾을 영어 단어를 입력하세요 (종료는 'q'): apple 
apple의 뜻: 사과
찾을 영어 단어를 입력하세요 (종료는 'q'): banana 
banana의 뜻: 바나나
찾을 영어 단어를 입력하세요 (종료는 'q'): hello 
hello은(는) 사전에 없는 단어입니다.
찾을 영어 단어를 입력하세요 (종료는 'q'): q
 */
public class DictionaryTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> dictionary = new HashMap<>();
        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String englishWord = scanner.nextLine();
            if (englishWord.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String koreanMeaning = scanner.nextLine();
            dictionary.put(englishWord, koreanMeaning);
        }
        System.out.println();

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String englishWord = scanner.nextLine();
            if (englishWord.equals("q")) {
                break;
            }
            if (!dictionary.containsKey(englishWord)) {
                System.out.println(englishWord + "은(는) 사전에 없는 단어입니다.");
                continue;
            }
            System.out.println(englishWord + "의 뜻: " + dictionary.get(englishWord));
        }


    }
}
