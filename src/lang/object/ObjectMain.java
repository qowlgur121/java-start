package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString은 객체의 정보를 리턴제공한다
        String string = child.toString();
        System.out.println(string);
    }
}
