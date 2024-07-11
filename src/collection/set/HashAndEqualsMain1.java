package collection.set;

import collection.set.member.Member;
import collection.set.member.MemberNoHashNoEq;

public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); //523429237
        System.out.println("m2.hashCode() = " + m2.hashCode()); //713338599
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //false

        set.add(m1);
        set.add(m2);

        //검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode()); //821270929
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains); //false

    }
}
