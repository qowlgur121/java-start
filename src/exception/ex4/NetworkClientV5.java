package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable {
    //implements AutoCloseable을 통해 AutoCloseable을 구현한다.
    private final String address; // 접속할 외부 서버 주소
    public boolean connectError; //boolean은 필드에서 디폴트로 fault이다.
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect() { //외부 서버에 연결한다.
        if (connectError) {
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }

        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) { //연결한 외부 서버에 데이터를 전송한다.
        if (sendError) {
            //throw new SendExceptionV3(data,address + " 서버에 데이터 전송 실패: " + data);
            //중간에 다른 예외가 발생했다고 가정
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
        }

        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }

    @Override
    public void close() {
        /**
         * AutoCloseable 인터페이스가 제공하는 이 메서드는 try가 다 끝나면 자동으로 호출된다.
         * 종료 시점에 자원을 반납하는 방법을 여기에 정의하면 된다.
         * 참고로 저절로 오버라이딩 되면서 public void close() throws Exception
         * 이렇게 throws Exception가 옆에 붙는데 지금은 예외를 던지지 않으므로 제거했다.
         */
        System.out.println("NetworkClientV5.close");
    }
}


