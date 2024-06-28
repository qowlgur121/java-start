package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1; //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar" + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        //printer.print()를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.

        //만약 localVar의 값을 변경한다면? 다시 캡처해야 하나??
        //localVar = 10; // 컴파일 오류
        //paramVar = 20; // 컴파일 오류

        return printer;
    }

    public static void main(String[] args) {
        //LocalOuterV3의 인스턴스는 main()이 스택영역에서 제거될 때까지 힙영역에서 존재한다.
        LocalOuterV4 localOuter = new LocalOuterV4();

        /*
        process안에서 생성한 LocalPriter 인스턴스는 메인에서 priter변수로 받기 때문에
        main()이 종료할 때까지 이 인스턴스는 생존한다.
         */
        Printer printer = localOuter.process(2);
        //이 시점에서 process()의 스택 프레임은 사라졌다. 그래서 paramVar, localVar같은 지역 변수는 process()와 함께 제거된다.


        /*
        이 printer.print()를 process()의 스택 프레임이 사라진 이후에 실행한다.
        그런데 print()에서 process()와 같이 스택 영역에서 제거된 localVar, paramVar을 접근해서 출력한다.
        이 프로그램을 실행하면 이상하게 정상적으로 출력된다. 왜 그런것일까...

        그것은 바로 "변수 캡처"때문이다. 인스턴스가 생성되기 전에 필요한 지역 변수를 복사한 뒤 이것들을 포함해서 인스턴스를 생성한다.
        그래서 블럭 내에 지역 변수들이 스택에서 제거되더라도 인스턴스에서 필요한 변수를 가지고 있기 때문에 위와 같은 상황에서 문제가 생기지 않는 것이다.
         */
        printer.print();


        // Printer printer = localOuter.process(2); 이 시점에 생성되는 인스턴스의 필드를 보기 위해 아래의 코드들을 추가해보자
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
        /*
        필드 확인
        field = int nested.local.LocalOuterV3$1LocalPrinter.value
        field = final int nested.local.LocalOuterV3$1LocalPrinter.val$localVar
        field = final int nested.local.LocalOuterV3$1LocalPrinter.val$paramVar
        field = final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0
        위와 같이 출력된다. 보면 알듯이 필요한 지역변수들이 변수캡쳐로 저장되어 있다.
        그래서 주의할 것이 지역 클래스가 접근하는 지역 변수는 절대로 중간에 값이 변하면 안된다. 복사한 것이니까...final같이 작동한다.

        또한 맨 밑줄 출력을 보면 알듯이 바깥 클래스인 LocalOuterV3의 참조값도 같이 저장하고 있다. 그래서 내부 클래스는 바깥 클래스의 멤버들을 접근할 수 있다.
         */
    }
}
