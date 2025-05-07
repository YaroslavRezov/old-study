public class JavaFuck56 {
    static int a = 0;

    int b = 5;

    public void foo(){
       a += 2;
       b += 2;
    }

    public static void main(String[] args) {
        JavaFuck56 p1 = new JavaFuck56();
        p1.foo();
        JavaFuck56 p2 = new JavaFuck56();
        p2.foo();

        System.out.println(p1.a+" "+p2.a + " " + p1.b + " " + p2.b);
    }
}
