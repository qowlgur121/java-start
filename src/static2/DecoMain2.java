package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); //인스턴스를 생성하지 않고 클래스에 있는 메서드를 바로 호출

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
