package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

/*
Map 을 사용해서 회원을 저장하고 관리하는 MemberRepository 코드를 완성하자.
Member , MemberRepositoryMain 코드와 실행 결과를 참고하자

실행결과

findMember1 = Member{id='id1', name='회원1'}
findMember3 = Member{id='id3', name='회원3'}
removedMember1 = null
 */
public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {  // 코드 작성
        memberMap.put(member.getId(), member);

    }

    public void remove(String id) {  // 코드 작성
        memberMap.remove(id);
    }

    public Member findById(String id) {  // 코드 작성
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        //코드 작성
        /*for (String id : memberMap.keySet()) {
            if (memberMap.get(id).getName().equals(name)) {
                return memberMap.get(id);
            }
        }*/
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}