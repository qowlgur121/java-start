package exception.ex4.exception;

public class NetworkClientExceptionV4 extends RuntimeException {
    //NetworkClient에서 발생하는 모든 예외는 이 예외를 부모로 하도록 설계한다.

    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
