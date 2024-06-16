package cond.my;

import java.util.Scanner;

public class NewSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();

        int price = switch (menu) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println(price);

    }
}
