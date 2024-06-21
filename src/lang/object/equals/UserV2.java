package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

/*
    @Override
    public boolean equals(Object object) {
        UserV2 userV2 = (UserV2) object;
        return id == userV2.id;
    }
*/

    //IDE가 알아서 equals 함수를 오버라이딩해서 만들어줄 수 있다.
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }

/* //해시코드는 나중에 학습
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
*/

}
