package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int localVar = 1;

        // 익명 클래스는 클래스의 본문(body)을 정의하면서 동시에 생성한다.
        Printer printer = new Printer() { // new 다음에 바로 상속 받으면서 구현 할 부모 타입을 입력하면 된다.
            // Printable 인터페이스를 구현하는 익명 클래스를 정의하고, 그 익명 클래스의 객체를 생성한다.
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar" + outInstanceVar);
            }
        }; //여기까지의 모두 포함한 것이 익명 클래스라고 함.
        // 즉 인터페이스를 구현과

        printer.print();
        System.out.println("printer.class=" + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter localOuter = new AnonymousOuter();
        localOuter.process(2);
    }
}
