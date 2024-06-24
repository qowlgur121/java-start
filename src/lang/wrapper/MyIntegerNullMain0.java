package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));

        /*
        -1
        0
        1
        -1
        문제가 있다. int타입은 값이 없음 상태를 가질 수 없어서 값이 없으면 -1이 나오게 메서드가 설계되었는데
        실제로 -1이 있어서 -1이 출력되었는지 없어서 -1이 출력됬는지 알기 힘든 상황이다
         */
    }

    public static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
