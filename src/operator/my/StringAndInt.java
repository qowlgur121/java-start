package operator.my;

public class StringAndInt {

    public static void main(String[] args) {
        int num1 = 10;
        String str = "Age";
        // 문자열에 다른거 더하면 문자열이 된다.

        System.out.println(str + ": " + num1);

        String sum = str + num1;

        System.out.println(sum);
    }
}
