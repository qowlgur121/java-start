package cond.my;

public class SwitchSkill {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            // 맞는 케이스에서 break가 없을때 그냥 바로 다음에 있는 케이스를 실행한다.
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급 받은 쿠폰: " + coupon);
    }
}
