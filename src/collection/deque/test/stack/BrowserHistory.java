package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {
        /*
        history.push(url);
        System.out.println("방문: " + url);
        */
        if (currentPage != null) { //현재 페이지가 비어있지 않으면 그 페이지를 스택에 넣자
            history.push(currentPage);
        }
        currentPage = url; //현재 페이지를 방문하는 페이지로 다시 설정
        System.out.println("방문: " + currentPage);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
