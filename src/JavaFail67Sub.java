public class JavaFail67Sub extends JavaFail67Super{
    public long cock(long l) {
        System.out.println();
        int i = 5;
        return i;
    }

    public static void main(String[] args) {
        JavaFail67Sub javaFail67Super = new JavaFail67Sub();
        javaFail67Super.cock();
    }
}
