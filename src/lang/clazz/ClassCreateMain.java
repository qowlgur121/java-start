package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        //Class 조회
        Class helloClass = Hello.class; //클래스에서 조회
        //Class helloClass = Class.forName("lang.clazz.Hello"); //문자열로 검색

        //생성자를 선택하고 선택된 생성자를 기반으로 인스턴스를 생성한다
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);

    }
}
