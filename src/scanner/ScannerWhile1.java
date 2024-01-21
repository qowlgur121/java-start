package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요(exit: 종료):");
            String str = scanner.nextLine();    //while문 안에 변수 선언해도 반복할 때마다 가비지컬렉션 때문에 메모리 관리가 되어서 괜찮다
            if (str.equals("exit")) {
                break;
            }
            System.out.println("입력한 문자열: " + str);
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
