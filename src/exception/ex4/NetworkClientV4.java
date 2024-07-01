package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {
    private final String address; // 접속할 외부 서버 주소
    public boolean connectError; //boolean은 필드에서 디폴트로 fault이다.
    public boolean sendError;

    public NetworkClientV4(String address) {
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
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실해: " + data);
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

}

/**
 * 처리할 수 없는 예외를 밖으로 던지고
 * 체크 예외에 대한 부담을 런타임 예외로 해결하는 게 좋다.
 * 왜 좋냐면 throws로 따로 선언 안해도 되니까
 *
 * 과거에 자바에서 제공하는 라이브러리들은 체크 예외가 많았다.
 * 그런데, 최근 자바에서 제공하는 또는 오픈소스들은 거의 다 언체크(런타임) 예외만 사용한다.
 * 그래서 필요한 건 잡으면 되고, 해결할 수 없는 거는 공통 예외 처리 부분을 만들어서 처리하는 거를 권장.
 *
 * 즉, 체크 예외 사용을 최소화하고 런타임 예외를 적극 활용하는 방식이 좋다.
 */

