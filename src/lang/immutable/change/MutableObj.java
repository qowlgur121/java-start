package lang.immutable.change;

public class MutableObj {

    private int value;

    public MutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MutableObj{" +
                "value=" + value +
                '}';
    }

    public void add(int addValue) {
        value = value + addValue;
    }
}
