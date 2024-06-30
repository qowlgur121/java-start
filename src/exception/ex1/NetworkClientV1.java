package exception.ex1;

public class NetworkClientV1 {
    private final String address; // 접속할 외부 서버 주소
    public boolean connectError; //boolean은 필드에서 디폴트로 fault이다.
    public boolean sendError;


    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() { //외부 서버에 연결한다.
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }

        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "sucess";
    }

    public String send(String data) { //연결한 외부 서버에 데이터를 전송한다.
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패: " + data);
            return "sendError";
        }

        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "sucess";
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
