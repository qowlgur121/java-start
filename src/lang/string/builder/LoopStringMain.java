package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); //특정 시점의 시간을 밀리초 단위로 가져온다

        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += "Hello Java ";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms"); //time = 60ms
        //오래걸림... 이것은 최적화가 안되기 때문임
    }
}
