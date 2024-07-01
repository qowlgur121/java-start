package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {
    //NetworkClient의 복잡한 로직을 처리한다.

    public void sendMessage(String data) {
        String address = "http://example.com"; //여기에 접속하려고 한다.
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //추가

        try { //정상흐름
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ", 메시지: " + e.getMessage());
        } finally { //위 상황이 뭐든 반드시 호출된다.
            client.disconnect();
        }

    }
}
