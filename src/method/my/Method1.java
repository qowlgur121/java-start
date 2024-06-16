package method.my;

public class Method1 {
    public static void main(String[] args) {
        String message = "HAHAHA";
        int number = 10;
        loopMethod(message, 3);
        loopMethod(number, 3);
    }
    public static void loopMethod(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    };

    public static void loopMethod(int number, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(number);
        }
    }
}
