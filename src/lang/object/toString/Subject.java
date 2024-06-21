package lang.object.toString;

public class Subject {
    private String subjectName;
    private int subjectNum;

    public Subject(String subjectName, int subjectNum) {
        this.subjectName = subjectName;
        this.subjectNum = subjectNum;
    }

    @Override
    public String toString() {
        return "subjectName:" + subjectName + "/" + "subjectNum:" + subjectNum;
    }
}
