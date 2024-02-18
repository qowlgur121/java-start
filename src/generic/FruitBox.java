package generic;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T, U> {
    List<T> fruits1 = new ArrayList<>();
    List<U> fruits2 = new ArrayList<>();

    public void add(T fruit1, U fruit2) {
        fruits1.add(fruit1);
        fruits2.add(fruit2);
    }

}
