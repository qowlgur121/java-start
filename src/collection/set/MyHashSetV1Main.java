package collection.set;

public class MyHashSetV1Main {

    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); //hashIndex 중복
        System.out.println("set = " + set);
//set = MyHashSetV1{buckets=[[], [1], [2], [99], [], [5], [], [], [8], [9], [], [], [], [], [14], []], size=7, capacity=16}

        //검색
        int searchValue = 9;
        boolean result = set.contains(searchValue); //O(n) -> O(1). 같은 해시인덱스에 값이 1개 또는 2개니까 거의 O(1)이다.
        System.out.println("set.contains(" + searchValue + ") = " + result); // //set.contains(9) = true
       

        //삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);  //removeResult = true
        System.out.println(set);
//MyHashSetV1{buckets=[[], [1], [2], [99], [], [5], [], [], [8], [], [], [], [], [], [14], []], size=6, capacity=16}
    }
}
