package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<Integer>[] buckets;

    private int size = 0; //들어간 데이터의 양
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        //같은 해시인덱스에 중복된 값이 존재하지 않을때만 연결리스트에 값을 넣어줘야 함.
        if (bucket.contains(value)) {  //같은 해시인덱스에 중복된 값이 존재할 때
            return false;
        }
        //같은 해시인덱스에 중복된 값이 존재하지 않을 때
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> busket = buckets[hashIndex];
        return busket.contains(searchValue);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; //
        boolean result = bucket.remove(Integer.valueOf(value));
        /**
         * remove()의 파라미터는 int index나 래퍼타입의 값 중 하나가 들어갈 수 있는데
         * 해시셋은 인덱스 개념이 없다. 그래서 래퍼타입인 Integer이 들어가야 하므로 래퍼변환을 하였다.
         */
        if (result) { // 삭제 완료
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
