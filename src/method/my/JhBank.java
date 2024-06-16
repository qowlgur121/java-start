package method.my;

import java.util.Scanner;

public class JhBank {
    public static void main(String[] args) {
        int accountBalance = 0;

        Scanner scanner = new Scanner(System.in);
        boolean breakPointer = false;
        while (true) {
            if (breakPointer) {
                break;
            }
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    int depositAmount = scanner.nextInt();
                    accountBalance += depositAmount;
                    System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + accountBalance);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    int withdrawAmount = scanner.nextInt();
                    accountBalance -= withdrawAmount;
                    System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + accountBalance);
                    break;
                case 3:
                    System.out.println("현재 장액: " + accountBalance);
                    break;
                case 4:
                    //breakPointer = true;
                    //break;
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요");
            }
        }
    }
}
