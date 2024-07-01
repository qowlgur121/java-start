package exception.ex2;

public class NetworkServiceV2_5 {
    //NetworkClient의 복잡한 로직을 처리한다.

    public void sendMessage(String data) {
        String address = "http://example.com"; //여기에 접속하려고 한다.
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        try { //정상흐름
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) { //예외흐름
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally { //위 상황이 뭐든 반드시 호출된다.
            client.disconnect();
        }

    }
}
