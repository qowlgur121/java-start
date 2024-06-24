package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5); //왼쪽이 오른쪽보다 클 때
        int i2 = compareTo(value, 10); //왼쪽이 오른쪽이랑 같을 때
        int i3 = compareTo(value, 20); //왼쪽이 오른쪽보다 작을 때

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }

    public static int compareTo(int value, int target) {
        if (value < target) { //왼쪽이 오른쪽보다 작으면
            return -1;
        } else if (value > target) { //왼쪽이 오른쪽보다 크면
            return 1;
        } else {
            return 0;
        }
    }
}
