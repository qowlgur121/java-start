package lambda;


public class LamdaEx1 {
    public static void main(String[] args) {
        action((x, y) -> {
            int result = x + y;
            System.out.println("result: " + result);
        });

        action(((x, y) -> {
            int result = x - y;
            System.out.println("result: " + result);
        }));
    }

    private static void action(Calculable calculable) {
        //데이터
        int x = 10;
        int y = 4;
        calculable.addTwoNumbers(x, y);
    }
}
