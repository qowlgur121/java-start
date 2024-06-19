package poly.basic;

public class MyCastingEx {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        checkChild(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        checkChild(parent2);
    }

    private static void checkChild(Parent parent) {
        System.out.println("검사합니다");
        if (parent instanceof Child) {
            System.out.println("Child가 인스턴스 맞음");
            System.out.println("Child로 다운 캐스팅을 진행하고 Child 함수를 호출합니다");
            Child child = (Child) parent;
            child.childMethod();
            return;
        }
        System.out.println("Child가 인스턴스가 아닙니다");
    }
}
