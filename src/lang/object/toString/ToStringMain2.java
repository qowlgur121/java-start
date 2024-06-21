package lang.object.toString;

public class ToStringMain2 {
    public static void main(String[] args) {
        Student student1 = new Student("배지혁", 25);
        Subject subject1 = new Subject("자바", 22);
        Subject subject2 = new Subject("파이썬", 23);

        System.out.println("1. 단순 toString 호출");
        System.out.println(student1.toString());
        System.out.println(subject1.toString());
        System.out.println(subject2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(student1);
        System.out.println(subject1);
        System.out.println(subject2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(student1);
        ObjectPrinter.print(subject1);
        ObjectPrinter.print(subject2);
    }
}
