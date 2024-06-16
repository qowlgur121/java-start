package loop.my;

public class PrintEven {
    public static void main(String[] args) {
        int even = 2;
        int count = 1;
        while (count <= 10) {
            System.out.println(even);
            even = even + 2;
            count++;
        }
    }
}
