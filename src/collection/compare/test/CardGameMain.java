package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
4종류카드 1~13번까지 총 52장 카드
1 1 1 1 2 2 2 3 3 3 3

1. 덱에 있는 카드를 랜덤하게 섞는다
2. 플레이어는 덱에서 카드를 5장씩 뽑는다.
3. 각 플레이어는 5장의 카드를 정렬된 순서대로 보여준다. 정렬 기준은 다음과 같다.
- 작은 숫자가 먼저 나온다.
- 같은 숫자의 경우 스페이스, 하트, 다이아, 클로바 순서
4. 카드 숫자의 합계가 큰 플레이어가 승리한다.
- 게임을 단순화 하기 위해 숫자만 출력한다.
- 합계가 같으면 무승부이다.
 */
public class CardGameMain {

    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();

        for (int i = 1; i <= 13; i++) {
            cards.add(new Card(i, "\u2660"));
            cards.add(new Card(i, "\u2665"));
            cards.add(new Card(i, "\u2666"));
            cards.add(new Card(i, "\u2663"));
        }

        Collections.shuffle(cards);
        List<Card> player1 = cards.subList(0, 5);
        Collections.shuffle(cards);
        List<Card> player2 = cards.subList(0, 5);

        System.out.println("플레이어1의 카드: " + player1);
        System.out.println("플레이어2의 카드: " + player2);


        //System.out.println("cards = " + cards);



    }
}
