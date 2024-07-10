package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {

    /**
     * ==MyArrayList 추가==
     * 앞에 추가 - 크기: 50000, 계산 시간: 121ms
     * 평균 추가 - 크기: 50000, 계산 시간: 105ms
     * 뒤에 추가 - 크기: 50000, 계산 시간: 3ms
     * ==MyLinkedList 추가==
     * 앞에 추가 - 크기: 50000, 계산 시간: 6ms
     * 평균 추가 - 크기: 50000, 계산 시간: 1121ms
     * 뒤에 추가 - 크기: 50000, 계산 시간: 2ms
     * ==MyArrayList 조회==
     * index: 0, 반복: 10000, 계산 시간: 1ms
     * index: 25000, 반복: 10000, 계산 시간: 0ms
     * index: 49999, 반복: 10000, 계산 시간: 0ms
     * ==MyLinkedList 조회==
     * index: 0, 반복: 10000, 계산 시간: 0ms
     * index: 25000, 반복: 10000, 계산 시간: 1ms
     * index: 49999, 반복: 10000, 계산 시간: 0ms
     * ==MyArrayList 검색==
     * findValue: 0, 반복: 10000, 계산 시간: 0ms
     * findValue: 25000, 반복: 10000, 계산 시간: 113ms
     * findValue: 49999, 반복: 10000, 계산 시간: 226ms
     * ==MyLinkedList 검색==
     * findValue: 0, 반복: 10000, 계산 시간: 1ms
     * findValue: 25000, 반복: 10000, 계산 시간: 454ms
     * findValue: 49999, 반복: 10000, 계산 시간: 900ms
     */
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==MyArrayList 추가==");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size);
        ArrayList<Integer> arrayList = new ArrayList<>(); //조회용 데이터로 사용
        addLast(arrayList, size);

        System.out.println("==MyLinkedList 추가==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);
        LinkedList<Integer> linkedList = new LinkedList<>(); //조회용 데이터로 사용
        addLast(linkedList, size);

        int loop = 10000;
        System.out.println("==MyArrayList 조회==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);

        System.out.println("==MyLinkedList 조회==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);

        System.out.println("==MyArrayList 검색==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);

        System.out.println("==MyLinkedList 검색==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long firstTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - firstTime) + "ms");
    }

    private static void search(List<Integer> List, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            List.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }





}
