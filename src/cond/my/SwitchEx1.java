package cond.my;

import java.util.Locale;
import java.util.Scanner;

public class SwitchEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choose = scanner.nextLine();

        switch (choose) {
            case "햄버거":
                System.out.println("햄버거");
                break;
            case "치킨":
                System.out.println("치킨");
                break;
            case "피자":
                System.out.println("피자");
                break;
            default:
                System.out.println("배고프다");
        }
    }
}
