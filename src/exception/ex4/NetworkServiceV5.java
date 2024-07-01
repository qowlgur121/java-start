package exception.ex4;

public class NetworkServiceV5 {
    //NetworkClient의 복잡한 로직을 처리한다.

    public void sendMessage(String data) {
        String address = "http://example.com"; //여기에 접속하려고 한다.

        try (NetworkClientV5 client = new NetworkClientV5(address)) { //정상흐름
            client.initError(data); //추가
            client.connect();
            client.send(data);
            //try 안에가 다 끝나면 close()가 자동으로 호출된다.
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
            /**
             * //여기는 단순히 발생한 예외를 잡아서 예외 메시지를 출력하고,
             * 잡은 예외를 다시 밖으로 던진다. 언체크 예외는 여기서 해결 할 수 없으니...
             * 만약 throw e를 하지 않으면 외부에 예외가 전파되지 않아서
             * 밖에서 호출한 입장에서는 예외 발생 사실을 알 수 없다.
             * 예외를 여기서 왼전히 처리 못하면 밖으로 던져야 한다!
             */
        }
    }
}
