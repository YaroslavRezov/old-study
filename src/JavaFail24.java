public class JavaFail24 {
    public JavaFail24() {
        System.out.println("cock");
    } // A1
    public JavaFail24(String s) {
        this();
        System.out.println("A :"+s);
    }  // A2

    public static void main(String[] args) {
        JavaFail24 javaFail24 = new JavaFail24("w");
    }
}
