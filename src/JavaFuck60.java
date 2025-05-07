public class JavaFuck60 {
    static String s = "";

    public static void m0(int a, int b) {
        s += a;
        m2();
        m1(b);
    }

    public static void m1(int i) {
        s += i;
        m();
    }

    public static void m2() {
        throw new NullPointerException("aa");
    }

    public static void m() {
        m0(1, 2);
        m1(3);
    }

    public static void main(String args[]) {
        loop:{


        }

        try {
            System.out.println();
        } catch (Exception e) {
            return;
        }
        System.out.println(s);
        System.out.println("S");
    }
}
