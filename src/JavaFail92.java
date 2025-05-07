public class JavaFail92 {
    static int a = 0;
    int b = 5;

    public void foo(){
        while(b>0){
            b--;
            a++;
        }
    }

    public static void main(String[] args) {
        JavaFail92 p1 = new JavaFail92();
        p1.foo();
        System.out.println(a);
        JavaFail92 p2 = new JavaFail92();
        System.out.println(a);
        p2.foo();

        System.out.println(p1.a+" "+p2.a);
        System.out.println(p1.b+" "+p2.b);

    }
}
