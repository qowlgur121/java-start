package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        System.out.println(list);

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addLast"); //마지막 위치에 추가하는 건 O(1)
        System.out.println(list);

        System.out.println("addFirst"); //첫번째 위치에 추가하는 건 O(n)이다. 다 오른쪽으로 한칸씩 밀어야해서
        list.add(0, "addFirst");
        System.out.println(list);

        //삭제
        Object removed1 = list.remove(4); //마지막 위치 삭제는 O(1)
        System.out.println("remove(4)=" + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0); //첫번째 위치 삭제는 O(n)이다. 다 왼쪽으로 값들을 한칸씩 옮겨야 해서
        System.out.println("remove(0)=" + removed2);
        System.out.println(list);
    }
}
