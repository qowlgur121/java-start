package poly.basic;

import org.w3c.dom.ls.LSOutput;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child(); //부모 참조변수에 자식 인스턴스를 넣기
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //instance of는 다운 캐스팅을 해도 되는지 알기 위해 쓰는 기능. 오른쪽이 자식이면 true

        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
