package lang.wrapper;

public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public  int compareTo(int target) {
        if (value < target) { //왼쪽이 오른쪽보다 작으면
            return -1;
        } else if (value > target) { //왼쪽이 오른쪽보다 크면
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
