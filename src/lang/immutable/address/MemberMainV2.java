package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("전주");

        MemberV2 member1 = new MemberV2("배지혁", address);
        MemberV2 member2 = new MemberV2("이윤진", address);

        //처음에 둘의 주소는 전주로 동일했음
        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);

        //배지혁의 주소를 서울로 변경하려고 함
        //member1.getAddress().setValue("서울"); //컴파일오류

        //주소는 변경할 수 있게 하는데 그 때 새로운 주소의 인스턴스를 받자
        member1.setAddress(new ImmutableAddress("서울"));

        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);
    }
}
