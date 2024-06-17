package construct.my;

public class StudentRegistration2 {
    public static void main(String[] args) {
        JBNUStudent jbnuStudent1 = new JBNUStudent();
        JBNUStudent jbnuStudent2 = new JBNUStudent();

        JBNUStudent[] jbnuStudents = {jbnuStudent1, jbnuStudent2};
        jbnuStudent1.initStudent(3, 25, "배지혁");
        jbnuStudent2.initStudent(2, 21, "이윤진");

        for (JBNUStudent jbnuStudent : jbnuStudents) {
            System.out.println(
                    "학년: " + jbnuStudent.grade +
                            ", 나이: " + jbnuStudent.age +
                            ", 이름: " + jbnuStudent.name);
        }
    }
}
