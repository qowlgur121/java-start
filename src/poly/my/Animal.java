package poly.my;

// 추상(abstract) 클래스로 만들면 이 클래스의 객체를 생성하지 못하게 한다.
public abstract class Animal {
    //추상 메서드를 만들면 자식 클래스에서는 반드시 이 클래스를 오버라이딩해야 한다.
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다");
    }
}
