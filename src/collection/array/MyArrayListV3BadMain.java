package collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        // 숫자만 입력 하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3");
        System.out.println(numberList);

        // Object를 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        // ClassCastException 발생, 문자를 Integer로 캐스팅
        Integer num3 = (Integer) numberList.get(2);
        // 그니까 numberList에는 Object[]멤버가 있어서 모든 타입이 들어갈 수 있는데
        // 만약 get()한다면 기본적으로 자바는 Object타입을 반환할텐데 그러기 때문에
        // 기대하는 타입으로 다운캐스팅해야 하는데
        // 이경우는 다 Integer로 들어가 있을거라고 착각하고 잘못 다운캐스팅 할 수 있다.
        // 또 이런 경우 자바는 컴파일 때 오류를 감지 못한다. 그러니까 애초에 값이 들어갈 때 허용하는 타입을 정하는 게 좋다.
    }
}
