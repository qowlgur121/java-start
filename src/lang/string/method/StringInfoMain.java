package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "전북대학교 컴퓨터공학부";
        System.out.println("문자열의 길이: " + str.length());
        System.out.println("문자열이 비어 있는지: " + str.isEmpty()); //길이가 0인지
        System.out.println("문자열이 비어 있거나 공백인지1: " + str.isBlank()); //길이가 0이거나 문자가 없는지
        System.out.println("문자열이 비어 있거나 공백인지2: " + "      ".isBlank());

        char c = str.charAt(7);
        System.out.println("7번 인덱스의 문자: " + c);
    }
}
