package set2.except;

public class exceptpractice {

    public static void main(String[] args) {
        System.out.println(method());
    }

    private static Object method() {
        try {
            int i = 10 / 0;
            return i;
        } catch (ArithmeticException e) {
            return "catch";
        } finally {
            return "finally";
        }
    }
}