package static1;

public class Data3 {
    public String name;
    public static int count; //static 추가

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
