package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;
    public static void main(String[] args) {
        //입력: {1, 2, 5, 8, 14, 99}

        //LinkedList를 담을 수 있는 배열을 선언
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>(); //배열 한칸씩 연결리스트를 할당해준다.
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); //중복. 같은 해시 인덱스의 연결리스트로 들어가게 된다.
        System.out.println("inputArray = " + Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " + contains);
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        //같은 값이 있는지 확인하기
        //먼저 해시인덱스을 찾자
        //해당하는 배열 인덱스에 들어가는데 만약 그 배열인덱스에 값이 하나가 아니라면 그 안의 연결리스트를 순회해야 한다.

        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; //해시인덱스에 해당하는 연결리스트 찾기
        return bucket.contains(searchValue); //연결리스트 내에서 값은 값이 존재하는지 확인
    }


    //LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value); //값을 해시인덱스로 변환
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1) 해시인덱스에 해당하는 배열인덱스의 연결리스트를 찾는다.
        if (!bucket.contains(value)) { //연결리스트 내에서 같은 값이 없을때
            bucket.add(value);
        }
    }



    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
