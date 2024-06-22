package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {

        Address destination1 = new Address("서울");
        Address destination2 = destination1;

        System.out.println("destination1 = " + destination1);
        System.out.println("destination2 = " + destination2);

        System.out.println("부산 -> destination2");
        destination2.setAddress("부산");

        System.out.println("destination1 = " + destination1);
        System.out.println("destination2 = " + destination2);
    }

}

