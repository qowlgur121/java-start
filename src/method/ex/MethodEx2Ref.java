package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        printMessage("Hello, world!", 3);
        printMessage("Java!", 5);
        printMessage("Spring!", 7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
