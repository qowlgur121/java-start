package generic;

public class Main {
    public static void main(String[] args) {
        FruitBox<Apple, Banana> box = new FruitBox<>();

        box.add(new Apple(), new Banana());

        Sample<Integer> s1 = new Sample<>();
        s1.setValue(1);

        Sample<Double> s2 = new Sample<>();
        s2.setValue(1.0);

        Sample<String> s3 = new Sample<>();
        s3.setValue("1");
    }
}
