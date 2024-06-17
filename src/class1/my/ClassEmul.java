package class1.my;

public class ClassEmul {

    public static void main(String[] args) {

        YPHighSchoolStudent ypHighSchoolStudent1 = new YPHighSchoolStudent();
        ypHighSchoolStudent1.age = 19;
        ypHighSchoolStudent1.grade = 3;
        ypHighSchoolStudent1.name = "배지혁";

        YPHighSchoolStudent ypHighSchoolStudent2 = new YPHighSchoolStudent();
        ypHighSchoolStudent2.age = 17;
        ypHighSchoolStudent2.grade = 1;
        ypHighSchoolStudent2.name = "이윤진";

        //배열에 {}하는건 초기화인데 초기화할 때 값을 나열하면 new를 안써도 됨. 주의점은 초기화는 한번만 쓸 수 있다.
        YPHighSchoolStudent[] ypHighSchoolStudents = {ypHighSchoolStudent1, ypHighSchoolStudent2};

        for (int i = 0; i < ypHighSchoolStudents.length; i++) {
            System.out.println("이름: " + ypHighSchoolStudents[i].name);
        }

        for (YPHighSchoolStudent ypHighSchoolStudent : ypHighSchoolStudents) {
            System.out.println(ypHighSchoolStudent.name);
        }
    }
}
