package loop.my;

public class Dowhile1 {
    public static void main(String[] args) {
        int i = 0;

        // 조건식에 맞지 않더라도 무조건 한번은 출력하는게 do while문이다.
        do {
            System.out.println(i++);
        } while (i < 0);
    }
}
