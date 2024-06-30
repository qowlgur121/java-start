package exception.ex0;

public class NetworkClientV0 {
    private final String address; // 접속할 외부 서버 주소

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() { //외부 서버에 연결한다.
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "sucess";
    }

    public String send(String data) { //연결한 외부 서버에 데이터를 전송한다.
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "sucess";
    }

    public void discount() {
        System.out.println(address + " 서버 연결 해제");
    }

}
