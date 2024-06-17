package construct.my;

public class ConstructionUseRegistration2 {
    public static void main(String[] args){
        ConstructUseStudent2 jbnuStudent1 = new ConstructUseStudent2(21, "이윤진");
        ConstructUseStudent2 jbnuStudent2 = new ConstructUseStudent2(3, 25, "배지혁");
        ConstructUseStudent2 jbnuStudent3 = new ConstructUseStudent2("배지혁");


        ConstructUseStudent2[] jbnuStudents = {jbnuStudent1, jbnuStudent2};
    }
}
