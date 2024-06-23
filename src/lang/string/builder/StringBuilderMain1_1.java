package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, sb); //가변객체니까 따로 반환을 안 받아도 된다. 자신의 정보가 바뀌는 것
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        String string = sb.toString();

        System.out.println("string = " + string);

        Object string1 = new Object();
        System.out.println(string1);
        System.out.println(string1.toString());

        String string2 = new String("연습");
        System.out.println(string2.toString());
    }
}
