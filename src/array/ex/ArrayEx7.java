package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "수학", "영어"};
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번의 학생의 성적을 입력하세요:");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            double average;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            average = (double) sum / scores[i].length;
            System.out.println((i+1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }

    }
}
