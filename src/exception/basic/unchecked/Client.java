package exception.basic.unchecked;

public class Client {
    public void call() {

        /**
         * 예외폭탄이 시작되면 알아서 밖으로 나간다. "throws"할 필요 없이. 컴파일러가 체크 안하고 밖으로 던진다.
         */
        throw new RuntimeException("ex");
    }
}
