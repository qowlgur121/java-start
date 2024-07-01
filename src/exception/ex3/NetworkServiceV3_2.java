package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
    //NetworkClient의 복잡한 로직을 처리한다.

    public void sendMessage(String data) {
        String address = "http://example.com"; //여기에 접속하려고 한다.
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //추가


        /**
         * 수 많은 예외가 발생하면 하나하나 일일히 잡기 힘드니까 아래와 같은 로직으로 짜봤다.
         */
        try { //정상흐름
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) { //중요하게 생각하는 오류는 따로.
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) { //위에서 잡고 못잡은 나머지가 내려올 것이다.
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }

    }
}
