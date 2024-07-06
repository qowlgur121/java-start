package collection.link;

/**
 * ==데이터 추가==
 * MyLinkedListV1{first=null, size=0}
 * MyLinkedListV1{first=[a], size=1}
 * MyLinkedListV1{first=[a->b], size=2}
 * MyLinkedListV1{first=[a->b->c], size=3}
 * ==기능 사용==
 * list.size(): 3
 * list.get(1): b
 * list.indexOf('c'): 2
 * list.set(2, 'z'), oldValue: c
 * MyLinkedListV1{first=[a->b->z], size=3}
 * ==범위 초과==
 * MyLinkedListV1{first=[a->b->z->d], size=4}
 * MyLinkedListV1{first=[a->b->z->d->e], size=5}
 * MyLinkedListV1{first=[a->b->z->d->e->f], size=6}
 */
public class MyLinkedListV1Main {

    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2, 'z'), oldValue = " + list.set(2, "z"));
        System.out.println(list);

        System.out.println("== 범위 초과==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
    }
}
