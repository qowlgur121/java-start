package poly.basic;

public class polyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); //이게 어떻게 가능한가! 부모 타입 변수가 자식 인스턴스를 담다니.
        poly.parentMethod();

        //Child child1 = new Parent(); //자식은 부모를 담을 수 없다.

        //자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod(); //참조 변수는 자신의 타입에 정의된 멤버만 볼 수 있다. 이거 접근하려면 형변환해야 함.
    }
}