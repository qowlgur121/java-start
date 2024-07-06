package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    //이 제네릭은 컴파일 때 고려해서 E의 타입인 것들만 입력받게 하거나 반환하게 하는데
    //이후 컴파일 이후에는 E들은 다 타입 이레이저로 Object로 바뀐다.
    //하지만 컴파일 시점에서 오류가 날지 검사를 했기 때문에 컴파일 이후에 Object로 바껴도 괜찮음

    private static final int DEFAULT_CAPACITY = 5; //디폴트 배열 공간의 크기

    private Object[] elementData;
    private int size = 0; //실제 저장된 요소의 개수

    public MyArrayListV4() {
        /**
         * 생성자로 객체 생성할 때 E를 적지 못하는데 그 이유는 객체는 컴파일 때가 아닌 런타임 때 생성된다.
         * 컴파일 이후에 Object로 변환하기 때문에 E들은 다 Object로 바뀌기 때문에 어떤 타입의 객체를
         * 런타임에 생성해야 할지 자바는 알 수 없기 때문에 어쩔 수 없이 Object 멤버의 인스턴스를 생성시킨다.
         * 그 대신 컴파일 시점에 값 받을 때 타입을 제한하도록 하면 멤버가 Object더라도 문제를 예방할 수 있다.
         */

        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e) { //맨 뒤에 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    //코드 추가
    public void add(int index, E e) {
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    //요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity); //newCapacity만큼의 배열을 만드는데 elementData 요소들 복사해서.
    }

    @SuppressWarnings("unchecked")
    public E get(int index) { //인덱스로 검색
        return (E) elementData[index];
    }

    public E set(int index, E element) { //교체
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    //코드 추가
    public Object remove(int index) {
        Object oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    //요소의 index부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    public int indexOf(E o) { //위치한 인덱스 찾기
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
