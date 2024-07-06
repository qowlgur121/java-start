package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5; //디폴트 배열 공간의 크기

    private Object[] elementData;
    private int size = 0; //실제 저장된 요소의 개수

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) { //맨 뒤에 추가
        elementData[size] = e;
        size++;
    }

    public Object get(int index) { //인덱스로 검색
        return elementData[index];
    }

    public Object set(int index, Object element) { //교체
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) { //위치한 인덱스 찾기
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
        }
        return -1; //실패하면 -1
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " size=" + size + ", capacity=" + elementData.length;
    }
}
