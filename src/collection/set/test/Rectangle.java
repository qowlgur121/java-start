package collection.set.test;

import java.util.Objects;

/*
RectangleTest , 실행 결과를 참고해서 다음 Rectangle 클래스를 완성하자.
Rectangle 클래스는 width , height 가 모두 같으면 같은 값으로 정의한다

실행 결과:
rectangle = Rectangle{width=10, height=10}
rectangle = Rectangle{width=20, height=20}
 */
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
