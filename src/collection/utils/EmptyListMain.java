package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {

    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        //빈 불변 리스트 생성
        List<Object> list3 = Collections.emptyList(); //자바5
        List<Object> list4 = List.of(); //자바9. 이걸 쓰자

        System.out.println("list3 = " + list3.getClass()); //list3 = class java.util.Collections$EmptyList
        System.out.println("list4 = " + list4.getClass()); //list4 = class java.util.ImmutableCollections$ListN
    }
}
