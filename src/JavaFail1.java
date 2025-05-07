public class JavaFail1 {
    int postinc;

    public static void main(String[] args) {
        JavaFail1 javaFail1 = new JavaFail1();
        System.out.println(javaFail1.cocker());
        System.out.println(javaFail1.postinc);
    }
    public int cocker() {
        return postinc++;
    }
}
