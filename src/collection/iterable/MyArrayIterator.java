package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {


    private int currentIndex = -1; //next를 했을 때 인덱스를 반환하기 위해. 인덱스는 0부터니까
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        //생성자를 통해 반복자가 사용할 배열을 참조한다. 여기서 참조한 배열을 순회할 것이다.
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() { //다음 항목이 있는지 검사한다.
        //현재가 인덱스의 끝보다 밑에 있는지
        return currentIndex < targetArr.length - 1;
    }

    @Override
    public Integer next() { //다음 항목을 반환한다.
        currentIndex++; //0 -> 1 - >2
        return targetArr[currentIndex];
    }
}
