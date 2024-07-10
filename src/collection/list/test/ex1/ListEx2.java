package collection.list.test.ex1;

import java.util.LinkedList;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> integers = new LinkedList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            integers.add(input);
        }

        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i));
            if (i != integers.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
