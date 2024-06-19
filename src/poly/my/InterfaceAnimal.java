package poly.my;

// 인터페이스로 만들면 이 클래스의 객체를 생성하지 못하게 한다.
public interface InterfaceAnimal {
    //인터페이스를 만들면 자식 클래스에서는 반드시 모든 메서드를 오버라이딩해야 한다.
    //그리고 인터페이스의 메서드는 public abstract를 생략해도 된다
    //public static final float PI = 3.14f;
    float PI = 3.14f; //인터페이스의 멤버변수는 기본적으로 public static final이기 때문에 생략가능
    void sound();

    void move();
}
