package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    /*
    MemberConstruct(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50;
    }
    */
    MemberConstruct(String name, int age) {
        this(name, age, 50); //생성자 내부에서 자신의 생성자를 호출한다.
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name " + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
