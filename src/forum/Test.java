package forum;

public class Test {
    public static void main(String[] args) {
        nPrintln( "Welcome to Java!", 5);
    }

    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(message);
    }

    public static void nPrintln(String message) {
        nPrintln(message, 1);
    }
}

