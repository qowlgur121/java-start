package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int parseInt1 = Integer.parseInt(str1);
        int parseInt2 = Integer.parseInt(str2);

        int sum = parseInt1 + parseInt2;

        System.out.println("두 수의 합: " + sum);

    }
}
