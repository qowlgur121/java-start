package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("전주");

        MemberV1 member1 = new MemberV1("배지혁", address);
        MemberV1 member2 = new MemberV1("이윤진", address);

        //처음에 둘의 주소는 전주로 동일했음
        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);

        //배지혁의 주소를 서울로 변경하려고 함
        member1.getAddress().setAddress("서울");

        //둘의 주소가 둘다 서울로 변경됨...사이드 이펙트..
        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);
    }
}
