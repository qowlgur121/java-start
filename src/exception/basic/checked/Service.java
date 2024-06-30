package exception.basic.checked;

public class Service {

    Client client = new Client();

    public void callCatch() {

        /**
         * client.call()호출했더니 해당 메서드에서 예외를 throw 했다면
         * 다시 이곳으로 돌아와서 예외를 catch한다. 어떻게 잡느냐...
         * MyCheckedException e 이걸로 잡는다
         * 자세하게...
         *
         * try 블록: 예외가 발생할 가능성이 있는 코드를 감싼다.
         * catch 블록: try 블록에서 MyCheckedException 예외가 발생하면, 해당 블록의 코드가 실행된다.
         * MyCheckedException e: 발생한 예외 객체를 e 라는 변수로 받는다.
         * System.out.println("예외 처리, message=" + e.getMessage());: 예외 메시지를 출력하여 예외를 처리한다.
         */
        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 흐름");

    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야한다.
     */
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
