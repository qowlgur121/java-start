package collection.my0;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));

        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.getContent() + "\t" + board.getWriter() + "\t" + board.getSubject());
        }
        System.out.println();


        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.getContent() + "\t" + board.getWriter() + "\t" + board.getSubject());
        }

        System.out.println();

        list.remove(0);  //0번 인덱스 자리에 바로 뒤 인덱스부터 앞으로 1씩 땡겨짐

        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.getContent() + "\t" + board.getWriter() + "\t" + board.getSubject());
        }

    }
}
