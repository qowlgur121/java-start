package construct.my;

public class ConstructionUseRegistration {
    public static void main(String[] args){
        ConstructUseStudent jbnuStudent1 = new ConstructUseStudent(2, 21, "이윤진");
        ConstructUseStudent jbnuStudent2 = new ConstructUseStudent(3, 25, "배지혁");

        ConstructUseStudent[] jbnuStudents = {jbnuStudent1, jbnuStudent2};
    }
}
