package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress destination1 = new ImmutableAddress("서울");
        ImmutableAddress destination2 = destination1; //참조값 대입을 막을 수 있는 방법이 없다.

        System.out.println("destination1 = " + destination1);
        System.out.println("destination2 = " + destination2);

        System.out.println("부산 -> destination2");

        destination2 = new ImmutableAddress("부산"); //새롭게 인스턴스를 만들고 참조해서 해결
        System.out.println("destination1 = " + destination1);
        System.out.println("destination2 = " + destination2);
    }

}

