package construct.my;

public class ConstructUseStudent2 {
    int grade;
    int age;
    String name;

    public ConstructUseStudent2(String name) {
        this(0, 0, name);
    }

    // 생성자를 쓰면 좋은 점은... 객체를 생성할 때 저 인자들을 넣지 않고 초기화 하면 컴파일오류가 뜬다. 즉 제약을 걸어둔 것이다.

    ConstructUseStudent2(int age, String name) {
        this(30, age, name);
    }

    public ConstructUseStudent2(int grade, int age, String name) {
        this.grade = grade;
        this.age = age;
        this.name = name;
    }
}
