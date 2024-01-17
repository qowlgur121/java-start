package loop.ex;

public class WhileEx {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        while (true) {
            if (count == 10) {
                break;
            }
            if (num % 2 == 0) {
                System.out.println(num);
                num++;
                count++;
            }
            num++;
        }
    }
}
