package lang;

//import java.lang.System; //원래는 이런 식으로 import해줘야 하지만 자바 내부에서 java.lang.클래스 를 알아서 각각 임포트함
//주의할 것은 import java.lang.*(lang 패키지 안에 있는 모든 것)가 아니라 java.lang 안에 있는 모든 클래스만 일일히 임폴드 한것임
public class LangMain {
    public static void main(String[] args) {
        //여기서 쓰이는 System 클래스는 java.lang 패키지 소속이다.
        System.out.println("hello java");
        //원래는 이처럼 클래스명을 java.lang을 입력해야 하지만 그걸 안해도 되는이유가 import되어서이다.
        //그런데 이 java.lang은 너무 자바프로그래밍에서 기본적인 것이라 컴파일러가 알아서 import해주었음
        java.lang.System.out.println("hello java");
    }
}
