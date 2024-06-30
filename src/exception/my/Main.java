package exception.my;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NetworkService networkService = new NetworkService();

        while (true) {

            System.out.print("전송할 문자: ");
            String data = scanner.nextLine();

            if (data.equals("exit")) {
                break;
            }

            networkService.sendMessage(data);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
