package exception.ex3;

import exception.ex3.exception.NetworkClientExceptionV3;

import java.util.Scanner;

public class MainV3 {

    public static void main(String[] args) {
        //NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        NetworkServiceV3_2 networkService = new NetworkServiceV3_2();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}

/**
 * 예외를 세분화해서 각각의 상황에 맞는 예외를 따로따로 만들었더니 다르게 로직을 처리할 수 있는 장점이 있다.
 */
