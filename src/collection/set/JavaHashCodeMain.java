package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        /*
        obj1.hashCode() = 925858445
        obj2.hashCode() = 1421795058
         */

        //각 클래스마다 대부분 내부 값을 기반으로 hashCode를 이미 오버라이딩 해두었다. 그래서 데이터의 값이 같으면 같은 해시 코드가 반환된다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("10.hashCode = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'AB'.hashCode() = " + strAB.hashCode());
        /*
        10.hashCode = 10
        'A'.hashCode() = 65
        'AB'.hashCode() = 2081
         */

        //hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode = " + Integer.valueOf(-1).hashCode());

        //둘은 같을까 다를까?, 인스턴스는 다르지만, equals는 같다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals, hashCode를 오버라이딩 하지 않은 경우와, 한 경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2)); //false (동일한 객체를 가리키는지)
        System.out.println("member1 equals member2 = " + member1.equals(member2)); //true (논리적 동등)
        System.out.println("member1.hashCode() = " + member1.hashCode()); //104101
        System.out.println("member2.hashCode() = " + member2.hashCode()); //104101
    }
}
