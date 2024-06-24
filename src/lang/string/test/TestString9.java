package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] datas = email.split("@");
        String id = datas[0];
        String domain = datas[1];

        System.out.println("ID: " + id);
        System.out.println("Domain: " + domain);
    }
}
