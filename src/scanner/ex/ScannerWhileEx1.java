package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            /*
            10 누르고 엔터누르면 10\n이 입력되는데
            nextInt()가 10만 가져가서
            다음 반복에서 nextLine()가져가는 문제가 발생한다.
             */
            scanner.nextLine(); //엔터를 먹게 하자.

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
