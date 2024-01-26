package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] numbers = {90, 80, 70, 60, 50};

        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        double average = (double) total / numbers.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
