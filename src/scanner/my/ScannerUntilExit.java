package scanner.my;

import java.util.Scanner;

public class ScannerUntilExit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String choose = scanner.nextLine();
            if (choose.equals("exit")) {
                System.out.println("종료");
                return;
            }
            System.out.println("입력한 문자열: " + choose);
        }
    }
}
