package exception.my;

public class NetworkClient {

    private String address;

    public NetworkClient(String address) {
        this.address = address;
    }

    public void connect() {
        System.out.println(address + " 서버 연결 성공");
    }

    public String send(String data) {
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "sucess";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }
}



