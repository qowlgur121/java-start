package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {

    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));

        //Array.sort()를 사용할 때 비교자(Comparator)를 넘겨주면 알고리즘에서 어떤 값이 더 큰지
        //두 값을 비교할 때, 비교자(Comparator)를 사용한다.
        Arrays.sort(array, new AscComparator());
        System.out.println("AscComparator: " + Arrays.toString(array));

        Arrays.sort(array, new DesComparator());
        System.out.println("DesComparator: " + Arrays.toString(array));
        Arrays.sort(array, new AscComparator().reversed()); //DesComparator와 같다.
        System.out.println("DesComparator: " + Arrays.toString(array));


    }

    static class AscComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);

            //o1이 o2보다 작으면 -1, 같으면 0, o1이 o2보다 크면 1
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }

    static class DesComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1; //AscComparator에다가 -1 곱
        }
    }

}
