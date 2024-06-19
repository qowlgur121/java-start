package poly.my.pay1;

import java.util.Scanner;

public class PayMain1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요:");
            String payOption = scanner.nextLine();
            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제 금액을 입력하세요:");
            int amount = scanner.nextInt();
            //nextInt()를 하면 엔터 앞까지를 입력이라고 하고 받아들이는데 버퍼에 엔터가 남아있다
            scanner.nextLine(); //버퍼에 남은 엔터를 없애기

            payService.processPay(payOption, amount);
        }
    }
}

/*
결제 수단을 입력하세요:kakao
결제 금액을 입력하세요:5000
결제를 시작합니다: option=kakao, amount=5000
카카오페이 시스템과 연결합니다.
5000원 결제를 시도합니다.
결제가 성공했습니다.
결제 수단을 입력하세요:exit
프로그램을 종료합니다.
 */