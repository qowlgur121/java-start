package array.my;

import java.util.Scanner;
public class Array1Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
