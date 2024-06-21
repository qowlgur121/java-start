package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-qowlgur");
        UserV2 user2 = new UserV2("id-qowlgur");

        System.out.println("identity(동일성): " + (user1 == user2));
        System.out.println("equality(동등성): " + user1.equals(user2));
    }
}
/*
identity(동일성): false
equality(동등성): true
 */
