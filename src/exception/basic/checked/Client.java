package exception.basic.checked;

public class Client {

    public void call() throws MyCheckedException{
        /**
         * throws 키워드의 역할은
         * 이 메서드는 MyCheckedException 예외를 발생시킬 수 있으며, 이를 호출한 곳에서 처리해야 한다는 것을
         * 알리는 역할을 한다.
         * 즉 컴파일러에게 예외 처리 책임을 위임한다는 것을 명시적으로 알리는 것이다.
         * 즉, throws MyCheckedException 선언을 통해 call() 메서드를 호출하는 쪽에서 예외 처리를 해야 함을 알린다.
         */

        throw new MyCheckedException("ex"); //예외도 객체이므로 new로 생성하고 예외를 던져야 함.
        /**
         * throw는 실제로 예외를 던지는 행동을 한 것이다. -> 여기서 해결 못하는 것을 알리기 위해 메서드 이름 옆에 throws로 선언해야 함
         * 이렇게 throw로 예외를 발생시키면 메서드를 호출한 곳에서 try-catch 블록을 사용하여 이 예외를 처리해야 한다.
         */

        /**
         * 정리하자면
         * throws는 호출한 함수가 예외를 처리해야 함을 선언하는 것이다.
         * throw는 실제로 예외를 발생시키는 "행동"이다. 프로그램 실행 중에 예외를 발생시키고, 흐름을 변경한다.
         */

    }
}
