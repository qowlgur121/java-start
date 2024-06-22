package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address destination1 = new Address("서울");
        Address destination2 = destination1;

        System.out.println("destination1 = " + destination1);
        System.out.println("destination2 = " + destination2);

        System.out.println("부산 -> destination2");
        //그니까 destination2의 값만 변경하고 싶었는데 1의 값도 같이 변경되었다. 코드가 길어지면 이런 사이드 이펙트가 많음. 문제야
        addressChange(destination2, "부산");

        System.out.println("destination1 = " + destination1);
        System.out.println("destination2 = " + destination2);
    }

    public static void addressChange(Address destination, String value) {
        System.out.println("주소를 " + value + "로 변경합니다");
        destination.setAddress(value);
    }

}

