package collection.set.member;

import java.util.Objects;

public class Member {

    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Member member = (Member) object;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() { //int형이기 때문에 음수가 나올 수도 있다. 그러니까 Math.abs()로 절대값 처리해야함.
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
