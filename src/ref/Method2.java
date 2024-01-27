package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = creatStudent("학생1", 15, 90);
        Student student2 = creatStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static Student creatStudent(String name, int age, int grade) {
        //student 변수는 함수가 끝나면 스택 메모리에서 사라지지만 Student 객체는 힙 메모리에 저장되고 사라지지 않는다.
        //나중에 가비지 컬렉션이 알아서 제거해줌
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
