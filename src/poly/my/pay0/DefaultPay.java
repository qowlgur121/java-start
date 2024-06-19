package poly.my.pay0;

public class DefaultPay implements Pay{
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
