package final1.my;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
        //this.id = id;  //컴파일 오류 발생
        this.name = name;
    }
}
