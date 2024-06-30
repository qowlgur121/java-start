package exception.past;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExeptionApp {
    public static void main(String[] args) {
        // try catch finally
        FileWriter f = null;
        try {
            f = new FileWriter("data.txt");
            f.write("Hello");
            // close를 하기 전에 예외가 발생할 수 있기 때문에 finally로 처리해야 한다.
            //f.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
