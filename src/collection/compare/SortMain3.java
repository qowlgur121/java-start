package collection.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] array = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));
        //[MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(array); //나이 기준으로 정렬함
        System.out.println(Arrays.toString(array));
        //[MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]

        //객체의 기본 정렬이 아닌 다른 정렬 방법을 사용해야 하는 경우, 비교자(Comparator)를 별로로 구현해서 정렬 메서드에 전달하면 된다.
        System.out.println("IdComparator 정렬");
        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array));
        //[MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]

        System.out.println("IdComparator().reverse() 정렬");
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.toString(array));


    }

}
