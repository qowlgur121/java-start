package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        //불변 객체에 있는 값을 변경하지 않고 그 값에 새로운 값을 더해서 새로운 결과를 만들고 싶을때
        ImmutableObj immutableObj = new ImmutableObj(10);
        immutableObj.add(20);

        //add하더라도 원래 value는 변경되지 않음
        System.out.println(immutableObj.getValue()); // 10

        //반환값을 받으면 새로운 결과도 만들 수 있다.
        ImmutableObj immutableObj2 = immutableObj.add(20);
        System.out.println(immutableObj2.getValue()); // 30
    }
}
