package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{
    //사용자 정의 예외 클래스

    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        /**
         * 예외를 만들 때 에러 코드도 넣고 메세지,
         * 왜 오류가 발생했는지 그 메시지도 받게 멤버를
         */
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
