public class JavaFuck21Sub extends JavaFuck21Super {
    public void m(){ }

    @Override
    public int m1(int a) {
        return 0;
    }

    public static void main(String[] args) {
        JavaFuck21Super a = new JavaFuck21Sub();
        ( ( JavaFuck21Sub) a ).m();
    }
}
