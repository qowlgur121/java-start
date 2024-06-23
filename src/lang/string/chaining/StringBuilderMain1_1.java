package lang.string.chaining;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4, sb)
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println(string);
    }
}
