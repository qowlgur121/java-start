package collection.list.test.ex1;

import java.util.LinkedList;
import java.util.Scanner;

public class ListEx3 {

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

        int total = 0;
        for (int i = 0; i < integers.size(); i++) {
            total += integers.get(i);
        }
        double average = (double) total/ integers.size();
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
