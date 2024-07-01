package exception.ex2;

public class NetworkServiceV2_3 {
    //NetworkClient의 복잡한 로직을 처리한다.

    public void sendMessage(String data) {
        String address = "http://example.com"; //여기에 접속하려고 한다.
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        try { //정상흐름
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) { //예외흐름
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
        //정상흐름과 예외흐름을 명확하게 분리해서 보기 좋다.
        //이 로직은 disconnect가 무조건 호출되지 않는다... 리소스 낭비 가능성 있다.
    }
}
