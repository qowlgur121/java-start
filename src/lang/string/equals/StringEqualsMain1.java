package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("전북대");
        String str2 = new String("전북대");
        System.out.println("new String()을 ==으로 비교: " + (str1 == str2)); //false
        System.out.println("new String()을 equals()으로 비교: " + str1.equals(str2)); //true

        String str3 = "전북대";
        String str4 = "전북대";
        System.out.println("리터럴로 만들어진 문자열을 == 으로 비교: " + (str3 == str3)); //true
        System.out.println("리터럴로 만들어진 문자열을 equals() 으로 비교: " + str3.equals(str4)); //true

        /*
        왜 리터럴로 만들어진 문자열은 ==을 했을때 true가 나오냐면 먼저 리터럴 "전북대"로 문자열을 만들려고 하니까
        컴파일러는 문자열 풀에다가 "전북대"를 값으로 가진 인스턴스를 만들고 str3에다가 참조시킨다.
        그런다음 str4을 보니까 이것도 리터럴로 문자열을 만들려고 하는 것 같은데 그 리터럴 "전북대"를 가진 인스턴스가 문자열 풀에 있어서
        새로운 문자열을 만들지 않고 그대로 그 인스턴스를 str4에 참조시킨다. 최적화 시킨 것이다. 그래서 ==으로 비교하면 참조값이 같으므로
        true가 나온다
         */
    }
}
