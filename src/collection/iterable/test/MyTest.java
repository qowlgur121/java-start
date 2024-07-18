package collection.iterable.test;

import java.util.Iterator;

public class MyTest implements Iterable<Integer> {

    private int[] arr;

    public MyTest(int[] arr) {
        this.arr = arr;
    }


    @Override
    public Iterator iterator() {
        return new MyIterator(arr);
    }
}
