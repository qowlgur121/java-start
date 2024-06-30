package exception.basic.checked;

/*
Exception을 상속 받은 예외는 체크 예외가 된다.
 */
public class MyCheckedException extends Exception{

    //커맨드 N 생성자로 만들었다
    public MyCheckedException(String message) {
        super(message);
    }

}
