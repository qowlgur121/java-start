package collection.set;

import collection.set.member.MemberOnlyHash;

public class HashAndEqualsMain2 {

    public static void main(String[] args) {
        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A"); //hash만 따로 정의한 클래스
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); //96
        System.out.println("m2.hashCode() = " + m2.hashCode()); //96
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //false

        set.add(m1); //index 6
        set.add(m2); //index 6 // 원래 add()에서는 같은 값이 들어가면 안되는데 들어가버렸다..중복체크에서 제대로 거르지 못해서
        System.out.println(set);
//MyHashSetV2{buckets=[[], [], [], [], [], [], [MemberOnlyHash{id='A'}, MemberOnlyHash{id='A'}], [], [], []], size=2, capacity=10}

        //검색 실패(인덱스가 같더라도 equals를 따로 구현하지 않아서 기본적으로 참조값으로 비교하여 싪패)
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode()); //96
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains); //false
    }
}
