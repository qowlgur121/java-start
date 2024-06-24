package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] parts = fruits.split(",");
        /*String joinedString = parts[0];
        for (int i = 0; i < parts.length - 1; i++) {
            joinedString = joinedString + "->" + parts[i];
        }
        */

        String joinedString = String.join("->", parts);

        System.out.println("joinedString = " + joinedString);
    }
}
