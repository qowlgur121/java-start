package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 호출 불가
        //privateField = 3;
        //data.privateMethod(); //private 함수이다. 외부에서 접근x

        data.innerAccess(); //public 함수이다. 외부에서 접근o. 일단 함수를 호출하면 그 함수 안에서는 privateMethod는 내부 호출임
    }
}
