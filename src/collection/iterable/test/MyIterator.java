package collection.iterable.test;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {

    private int[] arr;

    private int currentIndex = -1;

    public MyIterator(int[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < arr.length - 1;
    }

    @Override
    public Integer next() {
        return arr[++currentIndex];
    }
}
