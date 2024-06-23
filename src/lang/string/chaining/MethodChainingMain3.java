package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(10).add(20).add(30).getValue();

        System.out.println(result);
    }
}
