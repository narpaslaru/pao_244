package exceptions;

public class TestFinally {
    static int test() {
        try {
            System.out.println("Înainte de return");
            return 1;
        } finally {
            System.out.println("Bloc finally");
        }
    }
    public static void main(String[] args) {
        test();
    }
}
