package variable.my;

public class Var88 {

    public static void main(String[] args) {
        boolean c = true;
        char b = 'c';
        String e = "Hello";
        // 왜 L을 붙이냐면 컴파일러가 long타입으로 고려하기 위함. 안 붙이면 int로 인식
        // 왜 대문자 L이냐면 1과 안 헷갈리기 위해
        long i = 134L;

        // f를 붙이는 이유는 long과 같은 맥락인 이유로. 안 붙이면 double로 인식함
        float f= 1.1f;
        // float는 4바이트, double은 8바이트임
        double d= 10.2;
    }
}
