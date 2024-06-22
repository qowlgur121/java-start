package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);

        //add 이후에 원래 값이었던 10이 사라짐.
        System.out.println(obj.getValue());
    }
}
