package collection.iterable.test;

public class TestMain {

    public static void main(String[] args) {
        MyTest myTest = new MyTest(new int[]{1, 2, 3, 4, 5});

        for (Integer integer : myTest) {
            System.out.println("integer = " + integer);
        }
    }
}
