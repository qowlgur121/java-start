package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(10);
        ValueAdder adder2 = adder1.add(20);
        ValueAdder adder3 = adder2.add(30);

        System.out.println(adder3.getValue());
    }
}
