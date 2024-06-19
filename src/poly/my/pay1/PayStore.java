package poly.my.pay1;

public class PayStore {
    //기능만 보이는 클래스는 추상 클래스로 만들어서 객체 생성을 막자.
    //추상 클래스로 만들면 객체생성이 안되니 static으로 메서드를 제공하자
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
