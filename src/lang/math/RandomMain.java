package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();

        Random random1 = new Random(1); //seed가 1이면 계속 같은 랜덤값이 나옴
        for (int i = 0; i < 5; i++) {
            int randomNumber = random1.nextInt(10); //범위를 지정할 수 있음
            System.out.println("randomNumber = " + randomNumber);
        }

        int randomInt = random.nextInt(); //랜덤 정수값
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble(); //0.0d ~ 1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10); //0 ~ 9까지 출력
        System.out.println("0 ~ 9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; //1 ~ 10까지 출력
        System.out.println("1 ~ 10 = " + randomRange2);
    }
}
