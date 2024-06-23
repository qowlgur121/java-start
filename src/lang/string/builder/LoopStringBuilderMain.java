package lang.string.builder;

public class LoopStringBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java ");
        }
        String result = sb.toString();
        long endTime = System.currentTimeMillis();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms"); //time = 4ms... 아주 빠르다
        //StringBuilder은 루프를 돌때마다 객체를 새로 만들 필요 없이 자신의 값에다가 더하기 때문에 빠르다
    }
}
