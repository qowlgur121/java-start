package cond.ex;

public class MoveRateEx {
    public static void main(String[] args) {
        double rating = 7.1;

        if (rating <= 9) {
            System.out.println("어바웃타임");
        }
        if (rating <= 8) {
            System.out.println("토이 스토리");
        }
        if (rating <= 7){
            System.out.println("고질라");
        }
    }
}
