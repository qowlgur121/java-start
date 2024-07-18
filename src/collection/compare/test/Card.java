package collection.compare.test;

import java.util.List;

public class Card {

    private int num;
    private String shape;

    public Card(int num, String shape) {
        this.num = num;
        this.shape = shape;
    }

    public int getNum() {
        return num;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public String toString() {
        /*return "Card{" +
                "num=" + num +
                ", shape='" + shape + '\'' +
                '}';
        */
        return num +
                "(" + shape + ")";
    }
}
