package generic;

public class GenericEx1 {
    public static void main(String[] args) {
        print("안녕");
        print(1);
        print(3L);
        print(true);
    }

    public static <T> void print(T type) {
        System.out.println(type);
    }
}
