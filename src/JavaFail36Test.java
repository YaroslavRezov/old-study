class JavaFail36 {
    int x = 0, y = 0;
    public JavaFail36(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class  JavaFail36Test{
    public static void main(String[] args) throws Exception {
        JavaFail36 d = new JavaFail36(1, 1);
        d = new JavaFail36(2,2);
        System.out.println(d.x + " " + d.y);
    }
}
