package construct.my;

public class StudentRegistration {
    public static void main(String[] args) {
        JBNUStudent jbnuStudent1 = new JBNUStudent();
        JBNUStudent jbnuStudent2 = new JBNUStudent();

        JBNUStudent[] jbnuStudents = {jbnuStudent1, jbnuStudent2};
        initStudent(jbnuStudent1, 3, 25, "배지혁");
        initStudent(jbnuStudent2, 2, 21, "이윤진");

        for (JBNUStudent jbnuStudent : jbnuStudents) {
            System.out.println(
                    "학년: " + jbnuStudent.grade +
                    ", 나이: " + jbnuStudent.age +
                    ", 이름: " + jbnuStudent.name);
        }
    }

    private static void initStudent(JBNUStudent jbnuStudent, int grade, int age, String name) {
        jbnuStudent.grade = grade;
        jbnuStudent.age = age;
        jbnuStudent.name = name;
    }
}
