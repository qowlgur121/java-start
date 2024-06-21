package lang.object.toString;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string);

        //object 직접 출력... 사실 println은 객체의 정보를 출력하는 함수였다.
        System.out.println(object);
    }
}
