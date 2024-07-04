package generic.ex5;

public class Main {

    public static void main(String[] args) {
        GenericBox<Integer> box = new GenericBox<>();
        box.set(10);

        //컴파일 후에 제네릭 정보는 삭제되어서 T가 Object로 바꼈지만 알아서 다운 캐스팅을 해준다. (Integer)로
        Integer result = box.get();

    }
}
