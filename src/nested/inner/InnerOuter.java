package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3; //클래스(정적) 변수
    private int outInstanceValue = 2; //인스턴스 변수

    class Inner {
        // 인스턴스 내부 클래스
        private int innerInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(innerInstanceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outInstanceValue);
            // 외부 클래스의 클래스 멤버에는 접근 가능, private도 접근 가능
            System.out.println(InnerOuter.outClassValue);
        }
    }

}
