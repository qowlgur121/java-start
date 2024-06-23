package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "전북대";
        str.concat(" 컴공");
        System.out.println(str); //전북대

        /*
        concat으로 문자열을 합쳤는데 왜 안 합쳐지고 출력...그 이유는 String은 불변객체여서
         */
    }
}
