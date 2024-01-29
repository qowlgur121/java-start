package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 util1 = new DecoUtil1(); //인스턴스를 생성한다는게 인스턴스 변수를 활용하겠다는 건데 단순히 변수가 없고 기능만 제공할 뿐이라서 별로
        String deco = util1.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
