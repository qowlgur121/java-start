package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); //int(10) -> Integer(10)
        Integer i2 = Integer.valueOf("20"); //String(20) -> Integer(20)
        System.out.println("i2 = " + i2);
        int intValue = Integer.parseInt("10"); //String(10) -> int(10)

        //Integer가 정수의 여러 연산의 기능을 제공함
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
