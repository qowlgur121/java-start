package poly.test;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        //B bb = (B) a;

        A a2 = new B();

        if (a2 instanceof A) {
            System.out.println("bb는 B를 인스턴스로 가지고 있다.");
        } else {
            System.out.println("bb는 B를 인스턴스로 가지고 있지 않다.");
        }

    }
}
