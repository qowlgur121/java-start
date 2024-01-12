package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = ++a; // b = 2, a = 2
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;
        b = a++; // b = 1, a = 2
        System.out.println("a = " + a + ", b = " + b);

        a = 1; b = 0;

        a = a + 1;
        b = a;

        a = 1; b = 0;

        b = a;
        a = a + 1;

        b = ++a;


    }
}
