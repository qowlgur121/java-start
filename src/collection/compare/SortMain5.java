package collection.compare;

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);
        //[MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        //기본 정렬이 아닌 다른 정렬로 트리를 만들고 싶다면 트리를 만들 때 정렬자를 전달해야 함.
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);
        //[MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]
    }
}
