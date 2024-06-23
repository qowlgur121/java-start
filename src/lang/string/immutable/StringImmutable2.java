package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "전북대";
        //String은 불변객체라 원래 값은 변경 안되고 새로운 객체를 반환함.
        String str2 = str1.concat("컴공");

        System.out.println(str1); //전북대
        System.out.println(str2); //전북대컴공

        String str3 = str1 + "배지혁";
        System.out.println(str3); //전북대배지혁
    }
}
