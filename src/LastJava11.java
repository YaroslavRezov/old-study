public class LastJava11 {
    static int s = 0;
    public static void main(String[] args) {
        LastJava11Sub lastJava11 = new LastJava11Sub();
        lastJava11.instMethod();
        lastJava11.staticMethod();
        System.out.println(new LastJava11().s);

    }
}
